package solution;

public class Compute {

    private int add(int a, int b) {
        return a + b;
    }

    private int add(int a, int b, int c) {
        return a +b + c;
    }

    private double add (double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Compute c = new Compute();
        System.out.println(c.add(1, 2));
        System.out.println(c.add(1, 2, 3));
        System.out.println(c.add(1.0, 3.0));
    }
}
