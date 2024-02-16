//package CALL-BY-VALUE;

public class Example2 {
    int data = 50;

    void change(int data) {
        data = data + 100;
        System.out.println(data);
    }
}

class Call {
    public static void main(String[] args) {
        Example2 ex = new Example2();
        System.out.println("before: " + ex.data);
        ex.change(500);
        System.out.println("after: " + ex.data);
    }
}

// before: 50
// 500
// after: 50