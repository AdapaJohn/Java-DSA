public class Factors {
    public static void main(String[] args) {
        int num=6,number=-6;
        //Positive number
        System.out.print("factorial of "+num+" is :");
        for(int i=1;i<=num;i++){
            if((num%i)==0)
            System.out.print(i+" ");
        }
        //negative number
        System.out.print("\nfactorial of "+number+" is :");
        for(int i = number; i <= Math.abs(number); ++i) {

            // skips the iteration for i = 0
            if(i == 0) {
              continue;
            }
            else {
              if (number % i == 0) {
                System.out.print(i + " ");
              }
            }
        }
    }
}
