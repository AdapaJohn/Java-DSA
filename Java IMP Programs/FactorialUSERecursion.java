public class FactorialUSERecursion {

    public static void main(String[] args) {
        int num = 60;
        long factorial = recursive(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }
    public static long recursive(int num)
    {
        if (num >= 1)
            return num * recursive(num - 1);
        else
            return 1;
    }
}