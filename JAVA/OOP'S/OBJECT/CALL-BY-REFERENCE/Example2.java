//package CALL-BY-REFERENCE;

public class Example2 {
    int data = 50;

    void change(Example2 ex) {
        ex.data = ex.data + 100;
        System.out.println(data);
    }
}

class Call {
    public static void main(String[] args) {
        Example2 ex = new Example2();
        System.out.println("before:" + ex.data);
        ex.change(ex);
        System.out.println("after:" + ex.data);
    }
}
