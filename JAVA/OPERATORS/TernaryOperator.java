package OPERATORS;

public class TernaryOperator {
    public static void main(String[] args) {
        int febDays = 29;
        String result;
        result = (febDays == 28) ? "Not a Leap Year" : "Leap Year";
        System.out.println(result);
    }
}
