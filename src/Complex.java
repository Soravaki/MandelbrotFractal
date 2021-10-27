public class Complex {
    private final int num, complex;
    public Complex(int num, int complex){
        this.num = num;
        this.complex = complex;
    }

    public int getNum(){
        return num;
    }

    public int getComplex(){
        return complex;
    }


    public Complex add(Complex val){
        int numOutput = num + val.getNum();
        int complexOutput = complex + val.getComplex();
        return new Complex(numOutput, complexOutput);
    }

    public Complex subtract(Complex val){
        int numOutput = num - val.getNum();
        int complexOutput = complex - val.getComplex();
        return new Complex(numOutput, complexOutput);
    }
    // (x+yi)(u+vi) = (xu - yv) + (xv + yu)i
    public Complex multiply(Complex val){
        int numOutput = ( num*val.getNum() ) - (complex*val.getComplex());
        int complexOutput = ( num*val.getComplex() ) + (complex*val.getNum());
        return new Complex(numOutput, complexOutput);
    }

    public String toString() {
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
