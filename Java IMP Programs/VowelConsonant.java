public class VowelConsonant {
    public static void main(String[] args) {
        char ch = 'j';

        //number 1
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Entered alphabet is vowel");

                break;
            default:
                System.out.println("Entered alphabet is consonant");
                break;
        }

        //number 2
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Your eneterd alphabet is vowel ");
        } else {
            System.out.println("Youe enetred alphabet is consonant ");
        }
    }
}

//Try Scanner input from user
