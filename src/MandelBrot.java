public class MandelBrot {
    double x, y, a, b, imgWidth, imgHeight;
    public MandelBrot(double x, double y, double a, double b, double imgWidth, double imgHeight){
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
        this.imgWidth = imgWidth;
        this.imgHeight = imgHeight;

        Complex m = new Complex(1, 1);

    }
}
