package OPERATORS;

public class InstanceOfOperator {
    public static void main(String[] args) {
        String str = "Pro Gamer";
        boolean result = str instanceof String; // checks whether an object is an instance of a particular class
        System.out.println("Is str an object of string?" + result);
    }
}
