package abcpackage;

public class Test {             //Save file as Test.java
    int add(int a,int b){
        return a+b;
    }
}




//Used in another java file for execution
package xyzpackage;                 //Save file as Default.java
import abcpackage;

public class Default {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.add(10,21);
    }
    
}