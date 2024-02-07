import java.util.Scanner;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String sentence = "T    his is b  ett     er.";
        System.out.println("Original sentence: " + sentence);

        sentence = sentence.replaceAll("\\s", "");
        System.out.println("After replacement: " + sentence);

        //Input From User
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");

        // take the input
        String input = sc.nextLine();
        System.out.println("Original String: " + input);

        // remove white spaces
        input = input.replaceAll("\\s", "");
        System.out.println("Final String: " + input);
        sc.close();
    }
}
