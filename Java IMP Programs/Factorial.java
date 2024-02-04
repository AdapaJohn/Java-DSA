import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        int num=5;//i=1;
        //double factorial=1;
        // for(int i=0;i<=num;i++){
        //     factorial*=num;
        // }
        // while (i<=num) {
        //     factorial*=i;
        //     i++;
        //     //System.out.println(factorial);
        // }

        BigInteger factorial = BigInteger.ONE;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);
    }
}
