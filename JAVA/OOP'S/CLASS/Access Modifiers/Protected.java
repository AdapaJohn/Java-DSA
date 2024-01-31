package abcpackage;

public class Test {                     //Save file as Test.java
    protected int add(int a,int b){
        return a+b;
    }
}

//Used in another java file for execution
package xyzpackage;                     //Save file as Protected.java
import abcpackage;

class Protected  extends Test{
    public static void main(String[] args) {
        Test obj = new Test();
        System.out.println(obj.add(11, 22));
    }
}
