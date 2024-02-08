import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scam = new Scanner(System.in);
        System.out.print("your number is:");

        int man = scam.nextInt();
        System.out.println("entered number is:" + man);

    }
}

/*
 * import java.util.Scanner;
 * 
 * public class HelloWorld {
 * 
 * public static void main(String[] args) {
 * 
 * // Creates a reader instance which takes
 * // input from standard input - keyboard
 * Scanner reader = new Scanner(System.in);
 * System.out.print("Enter a number: ");
 * 
 * // nextInt() reads the next integer from the keyboard
 * int number = reader.nextInt();
 * 
 * // println() prints the following line to the output screen
 * System.out.println("You entered: " + number);
 * }
 * }
 */