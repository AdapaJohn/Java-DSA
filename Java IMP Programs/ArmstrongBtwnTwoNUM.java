public class ArmstrongBtwnTwoNUM {
    public static void main(String[] args) {
        long low=1,high=1000;
        for(long number = low+1;number<high;number++){
            if (checkArmstrong(number)) {
                System.out.print(number+" ");
            }
        }
    }

    private static boolean checkArmstrong(long number) {
        long digits=0,result=0,originalNumber=number;
        while (originalNumber!=0) {
            originalNumber/=10;
            digits++;
        }
        originalNumber=number;
        while (originalNumber!=0) {
            long remainder=originalNumber%10;
            result+=Math.pow(remainder, digits);
            originalNumber/=10;
        }

        if (result==number)
            return true;
        return false;
    }
}
