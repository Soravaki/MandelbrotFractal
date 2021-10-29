public class Runner {
    public static void main(String[] args) {
        Complex x = new Complex(3, 4);
        Complex y = new Complex(4, 2);
        System.out.println(x.add(y));
        System.out.println(x.subtract(y));
        System.out.println(x.multiply(y));
        System.out.println(x.exp(1));
        System.out.println(x.exp(2));
        System.out.println(x.multiply(x));
        System.out.println();

        Complex m = new Complex (1, 1);
        System.out.println("z1 = " + m);
        System.out.println("z2 = " + m.multiply(m));

    }
}
