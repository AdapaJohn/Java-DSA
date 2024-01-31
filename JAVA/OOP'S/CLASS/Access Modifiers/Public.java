package abcpackage;;

public class Test {               //Save file as Test.java
    public int add(int a,int b){
        return a-b;
    }
}


//Used in another java file for execution
package xyzpackage;             //Save file as Public.java
import abcpackage;

class Public{
    public static void main(String[] args) {
        Test.obj = new Test();
        System.out.println(obj.add(100,1));
    }
}