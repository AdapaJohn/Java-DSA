import java.util.Scanner;

public class AddTwoIntegers {
    public static void main(String[] args) {
        int first=20;
        int second=30;
        int sum=first + second;
        System.out.println(sum);
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter first number:");
        int reader1= sc.nextInt();
        System.out.print("Enter second number:");
        int reader2= sc.nextInt();
        int sum1 = reader1+reader2;
        System.out.println("Sum of two numbers ="+ sum1);

    }
}
/*
 * class Main {

  public static void main(String[] args) {
    
    int first = 10;
    int second = 20;

    // add two numbers
    int sum = first + second;
    System.out.println(first + " + " + second + " = "  + sum);
  }
}
 */

