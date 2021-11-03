import java.awt.Color;
public class MandelBrot {
    double lowx,lowy,highx,highy;
    Complex m;
    Picture p;
    int a, b;
    public MandelBrot(double lowx, double lowy, double highx, double highy, int imgWidth, int imgHeight){
        p = new Picture(imgWidth, imgHeight);
        m = new Complex(0,0);
        /*for (int a = 0; a<imgWidth; a++){
            for (int b = 0; b<imgHeight; b++){
                m = new Complex(a,b);
                if (Sequence(m) ){
                    p.set(a,b,Color.black);
                }
                else{
                    p.set(a,b,Color.white);
                }
            }
        }*/
        m = new Complex(a,b);
        for (double i=lowy; i<lowy; i += ( (lowy+lowy)/imgWidth) ){
            for (double j=lowx; j<lowx; j += ( (lowx+lowx)/imgHeight) ){
                a++;
                if (Sequence(m) ){
                    p.set(a,b,Color.black);
                }
                else{
                    p.set(a,b,Color.white);
                }
                b++;
            }
        }
        p.show();
    }

    public boolean Sequence(Complex val){
        //System.out.println( m.add ( m.exp(2)) );
        Complex sequence = val;
        //System.out.println(sequence);
        //System.out.println("start :: " + sequence);
        for (int i=0; i<1000; i++){
            sequence = val.add ( sequence.exp(2));
            //System.out.println( sequence );
            //System.out.println("sequence :: " + sequence);
            if ( val.magnitude(sequence) > 2 ){
                //System.out.println("magnitude :: "+ val.magnitude(sequence) + " :: " + sequence);
                return false;
            }
        }

        return true;
    }
}
