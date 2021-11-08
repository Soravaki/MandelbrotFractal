import java.awt.Color;
public class MandelBrot {
    double lowx,lowy,highx,highy;
    Complex m;
    Picture p;
    int a, b;
    public MandelBrot(double lowx, double lowy, double highx, double highy, int imgSize){
        p = new Picture(imgSize, imgSize);
        m = new Complex(a,b);
        int max = 255;

        Color[] colors = new Color[max];
        for (int i = 0; i<max; i++) {
            //colors[i] = Color.getHSBColor(i/360f,  1, i/(i+8f)); //OG
            //colors[i] = Color.getHSBColor(i/(220f/360),  1, i/(i+8f)); // weird hurt eye
            colors[i] = Color.getHSBColor(i/360f,  1, i/(i+8f));
        }

        for (int i = 0; i<imgSize; i++){
            for (int j = 0; j<imgSize; j++){

                p.set(i,j, colors[i]);
            }
            System.out.println(i + " :: " +colors[i]);
            p.show();
        }

        final double stepx = (highx - lowx) / imgSize;
        final double stepy = (highy - lowy) / imgSize;
        for (int x = 0; x < imgSize; x++) {
            for (int y = 0; y < imgSize; y++) {
                Complex c = new Complex(lowx+x*stepx, lowy+y*stepy);
                int iterations = Sequence(c);
                if (iterations < max) {
                    p.set(x, y, colors[iterations]);
                }

                else p.set(x, y, Color.black);
            }
        }
        p.show();
    }

    public int Sequence(Complex val){
        int iterations = 0;
        Complex sequence = val;
        //System.out.println(val);
        while ( val.magnitude(sequence) < 2 && iterations < 255) {
            sequence = val.add ( sequence.exp(2));
            //System.out.println(sequence);
            iterations++;
        }
        return iterations;
    }
}