package OPERATORS;

public class ShiftOperator {
    public static void main(String[] args) {
        System.out.println(10 << 0);
        System.out.println(10 << 1);
        System.out.println(10 << 2);
        System.out.println(10 >> 0);
        System.out.println(10 >> 1);
        System.out.println(10 >> 2);
        System.out.println(10 >>> 0);
        System.out.println(10 >>> 1);
        //System.out.println(10 <<< 0);                 //unsigned left operator not working
        //System.out.println(10 <<< 1);                 //unsigned left operator not working
    }
}
