package VARIABLES;

public class StaticVariable {
    static int a = 10;
    void add()
    {
        System.out.println(a);
    }

    public static void main(String[] args) {
        StaticVariable ab = new StaticVariable();
        ab.add();
    }
}
