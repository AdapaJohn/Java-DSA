public class SumNaturalRecursion {
    public static void main(String[] args) {
        int num = 60;
        int sum = addnumbers(num);
        System.out.println(sum);
    }

    private static int addnumbers(int number) {
        if (number != 0) {
            return number + addnumbers(number - 1);
        } else {
            return number;
        }
        // return number+addnumbers(number-1);
    }
}
