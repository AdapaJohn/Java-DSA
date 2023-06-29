package OPERATORS;

public class UnaryOperator {
    public static void main(String[] args) {
        int a = 10, b = 10;
        boolean c = true, d = false;
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);
        System.out.println(a++ + ++a);
        System.out.println(b++ + ++b);
        System.out.println(!c);
        System.out.println(!d);
    }
}
