public class CountingDigits {
    public static void main(String[] args) {

        int count = 0, num = 38757452;
        //for (; num != 0; num /= 10, ++count);

        while (num != 0) {
             num /= 10;
             ++count;
         }

        System.out.println("Number of digits: " + count);
    }
}
