import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        char ch = 'D';
        char ch1 = 'd';
        int num = ch;
        int num2 = (int) ch1;
        Scanner scam = new Scanner(System.in);
        System.out.print("your alphabet is:");

        String man = scam.next();
        String num3 = man;
        System.out.println("ASCII capital letter number is:" + num);
        System.out.println("ASCII small letter number is:" + num2);
        System.out.println("ASCII capital letter number is:" + num3);

    }
}
