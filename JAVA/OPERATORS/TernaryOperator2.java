package OPERATORS;

public class TernaryOperator2 {
    public static void main(String[] args) {
        boolean b = (1 > 3) ? ((2 > 3) ? true : false) : ((2 < 3) ? true : false);
        System.out.println(b);
    }
}
