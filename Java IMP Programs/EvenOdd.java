import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num =sc.nextInt();

        //number 1-ternary operator
        //String evenOdd = (num % 2 == 0) ? "even" : "odd"; 

        //number 2-if-else statement
        if ((num%2)==0) {
            System.out.println("Your entered number "+ num + " is even");
        } else {
            System.out.println("Your entered number "+ num + " is odd");
        }
    }
}
