//import java.util.Scanner;

public class CheckAlphabet {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // char ch=sc.next.charAt(0);
        char ch = 'g';
        // if (ch>='a'&&ch<='z'||ch>='A'&&ch<='Z') {
        //     System.out.println(ch + " is a alphabet");
        // } else {
        //     System.out.println(ch + " is not a alphabet");
        // }
         
        String output = (ch>='a'&&ch<='z') || (ch>='A'&&ch<='Z')? ch + " is a alphabet" : ch + " is not a alphabet";
        //System.out.println(output);

        if (Character.isAlphabetic(ch)) {
            System.out.println(ch + " is a alphabet");

        } else {
          System.out.println(ch + " is not a alphabet");

        }
    }
}
