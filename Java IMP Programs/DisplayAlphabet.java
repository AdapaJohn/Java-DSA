public class DisplayAlphabet {
    public static void main(String[] args) {

        char c, c2;

        for (c = 'a'; c <= 'z'; ++c)  //small letters
            System.out.print(c + " ");
        System.out.println(" ");

        for (c2 = 'A'; c2 <= 'Z'; ++c2)   //Big letters
            System.out.print(c2 + " ");
    }
}
