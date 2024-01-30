package METHODS;

//Example 1
public class NonReturnType {
    public static void main(String[] args) {
        man();
        System.out.println("Hello");
    }

    static void man() {
        System.out.println("Hi");
    }

}
//Example 2
public class NonReturnType {
    public static void main(String[] args) {
        NonReturnType obj = new NonReturnType();
        obj.man();
        System.out.println("Hello");
    }
    static void man(){
        System.out.println("Hello");
    }
}
