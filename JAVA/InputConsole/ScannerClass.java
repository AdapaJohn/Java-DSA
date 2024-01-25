package InputConsole;
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println("Entered message is "+st);
    }
}
