//package CALL-BY-REFERENCE;

public class Example1 {
    int x,y;
    public static void main(String[] args) {
        Example1 ex1 = new Example1();
        ex1.x = 1;
        ex1.y = 2;
        System.out.println("Before calling method x=" + ex1.x + " y=" + ex1.y);
        change(ex1);
        System.out.println("After calling method x=" + ex1.x + " y=" + ex1.y);
    }

    //private int x;

    private static void change(Example1 ex) {
        ex.x = 2;
        ex.y = 1;
    }
}

//OUTPUT:
// Before calling method x=1 y=2
// After calling method x= y=1