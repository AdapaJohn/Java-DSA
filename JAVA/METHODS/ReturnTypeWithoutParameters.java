package METHODS;

public class ReturnTypeWithoutParameters {
    public double add() {
        double sum = 5 + 3;
        return sum;
    }

    public static void main(String[] args) {
        ReturnTypeWithoutParameters a = new ReturnTypeWithoutParameters();
        double sum = a.add();
        System.out.println("Sum is:" + sum);
    }
}
