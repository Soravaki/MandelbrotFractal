public class Complex {
    private final double num, complex;

    public Complex(double num, double complex) {
        this.num = num;
        this.complex = complex;
    }

    public double getNum() {
        return num;
    }

    public double getComplex() {
        return complex;
    }

    public Complex add(Complex val) {
        double numOutput = num + val.getNum();
        double complexOutput = complex + val.getComplex();
        return new Complex(numOutput, complexOutput);
    }

    public Complex subtract(Complex val) {
        double numOutput = num - val.getNum();
        double complexOutput = complex - val.getComplex();
        return new Complex(numOutput, complexOutput);
    }

    // (x+yi)(u+vi) = (xu - yv) + (xv + yu)i
    public Complex multiply(Complex val) {
        double numOutput = (num * val.getNum()) - (complex * val.getComplex());
        double complexOutput = (num * val.getComplex()) + (complex * val.getNum());
        return new Complex(numOutput, complexOutput);
    }

    public Complex exp(int n) {
        Complex ans = new Complex(num, complex);
        /*double real = num;
        double imag = complex;*/
        if (n > 1) {
            for (int i = 1; i < n; i++) {
                ans = multiply(ans);
            }
        }
        if (n == 1) {
            return new Complex(num, complex);
        }

        return ans;
    }

    public double magnitude(Complex val){
        return Math.sqrt(Math.pow(val.getNum(), 2) + Math.pow(val.getComplex(), 2) );
    }


    public String toString() {
        if ( (num == 0.0) && (complex == 0.0)){
            return "0 + 0i";
        }
        if ( (complex ==  1.0 ) || ( complex ==  -1.0) ){
            return num + " + i" ;
        }
        // If real numbers equals 0
        if (num == 0){
            return complex + "i";
        }
        // if the imaginary number is positive
        if (complex > 0) {
            return num + " + " + complex + "i";
        }
        // if the imaginary number is negative
        if (complex < 0){
            return num + " - " + complex*-1 + "i";
        }

        else{
            return "";
        }
    }
}
