public class CheckPrime {

    public static void main(String[] args) {

        int num = 29,i=2;
        boolean flag = false;
        // for (int i = 2; i <= num / 2; ++i) {
        // // condition for nonprime number
        // if (num % i == 0) {
        // flag = true;
        // break;
        // }
        // }
        while (i <= num / 2) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }

            ++i;
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}