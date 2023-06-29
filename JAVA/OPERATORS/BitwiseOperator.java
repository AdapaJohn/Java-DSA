package OPERATORS;

public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 12, b = 25, result1, result2;
        result1 = a & b;                   //32  16  8  4  2  1
        result2 = a | b;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(~1);
        System.out.println(~2);
        System.out.println(~3);
    }
}
