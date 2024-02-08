public class ReverseANumber {
    public static void main(String[] args) {
        int num = 1234578, reversed = 0;

        System.out.println("Original Number: " + num);


        for(;num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
          }

        // run loop until num becomes 0
        // while (num != 0) {

        //     // get last digit from num
        //     int digit = num % 10;
        //     reversed = reversed * 10 + digit;

        //     // remove the last digit from num
        //     num /= 10;
        // }

        System.out.println("Reversed Number: " + reversed);
    }
}
