public class Runner {
    public static void main(String[] args) {
        Complex x = new Complex(3, 4);
        Complex y = new Complex(4, 2);
        System.out.println(x.add(y));
        System.out.println(x.subtract(y));
        System.out.println(x.multiply(y));
    }
}
