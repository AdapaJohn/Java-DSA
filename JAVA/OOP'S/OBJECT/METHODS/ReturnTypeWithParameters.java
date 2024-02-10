package METHODS;

public class ReturnTypeWithParameters {
    public int add(int x, int y) {
        int z = x + y;
        return z;
    }

    public static void main(String[] args) {
        ReturnTypeWithParameters test = new ReturnTypeWithParameters();
        int add = test.add(10, 20);
        System.out.println("Sum : " + add);
    }
}
