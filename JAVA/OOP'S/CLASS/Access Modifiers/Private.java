package abcpackage;

public class Test {                 //Save file as Test.java
    private double num = 100;

    private int square(int a) {
        return a * a;
    }
}


//Used in another java file for execution
package xyzpackage;                 //Save file as private.java
import abcpackage;

public class Private {

    public static void main(String[] args) {
        Test obj = new Test();
        System.out.println(obj.num);
        System.out.println(obj.square(10));
    }
}
