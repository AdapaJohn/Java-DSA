//package CALL-BY-VALUE;

public class Example1 {
    public static void main(String[] args) {
        int x=1;
        increment(x);
        System.out.println("Value of x after calling increment() : "+x);
    }
    public static void increment(int x) {
        x++;
        System.out.println(x);
    }
}

//Value of x (in the increment function): 2 Value of x after calling increment(): 1
