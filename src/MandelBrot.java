import java.awt.Color;
public class MandelBrot {
    double lowx,lowy,highx,highy;
    Complex m;
    Picture p;
    int a, b, hue;
    boolean backwards = false;
    public MandelBrot(double lowx, double lowy, double highx, double highy, int imgSize) {
        p = new Picture(imgSize, imgSize);
        m = new Complex(a, b);
        int max = 255;

        Color[] colors = new Color[max];
        final double stepx = (highx - lowx) / imgSize;
        final double stepy = (highy - lowy) / imgSize;
        while (true) {
            if (!backwards) hue += 2;
            if (backwards) hue -= 2;

            for (int i = 0; i < max; i++) {
                colors[i] = Color.getHSBColor(hue / 360f, 1, i / (i + 8f));
            }
            for (int x = 0; x < imgSize; x++) {
                for (int y = 0; y < imgSize; y++) {
                    Complex c = new Complex(lowx + x * stepx, lowy + y * stepy);
                    int iterations = Sequence(c);
                    if (iterations < max) {
                        p.set(x, y, colors[iterations]);
                    } else p.set(x, y, Color.black);
                }
            }
            if (hue < 361) backwards = true;
            p.show();
        }
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