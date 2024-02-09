public class Swapping {
    public static void main(String[] args) {
        int first = 20, second = 30;
        System.out.println("before swap");
        System.out.println("first number:" + first);
        System.out.println("second number:" + second);

        // number 1
        // int num = first;
        // first=second;
        // second=num;

        // number 2
        first = first - second;
        // first = 12.0f - 24.5f
        second = first + second;
        // second = (12.0f - 24.5f) + 24.5f = 12.0f
        first = second - first;
        // first = 12.0f - (12.0f - 24.5f) = 24.5f

        System.out.println("after swap");
        System.out.println("first number:" + first);
        System.out.println("second number:" + second);
    }
}

/*
 * public class SwapNumbers {
 * 
 * public static void main(String[] args) {
 * 
 * float first = 1.20f, second = 2.45f;
 * 
 * System.out.println("--Before swap--");
 * System.out.println("First number = " + first);
 * System.out.println("Second number = " + second);
 * 
 * // Value of first is assigned to temporary
 * float temporary = first;
 * 
 * // Value of second is assigned to first
 * first = second;
 * 
 * // Value of temporary (which contains the initial value of first) is assigned
 * to second
 * second = temporary;
 * 
 * System.out.println("--After swap--");
 * System.out.println("First number = " + first);
 * System.out.println("Second number = " + second);
 * }
 * }
 */