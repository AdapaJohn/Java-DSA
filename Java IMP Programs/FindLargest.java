public class FindLargest {
    public static void main(String[] args) {

        float p1 = 23.5f, p2 = 24.56f, p3 = 32f, p4 = 288.768f;
        if (p1 > p2) {
            if (p1 > p3) {
                System.out.println("p1 is largest number");
            } else {
                System.out.println("p3 is largest number");
            }

        } else {
            if (p2 > p3) {
                if (p2 > p4) {
                    System.out.println("p2 is Largest number");
                } else {
                    System.out.println("p4 is Largest number");
                }
            } else {
                System.out.println("p4 is largest number");
            }
        }
    }
}

/*
 * public class Largest {
 * 
 * public static void main(String[] args) {
 * 
 * double n1 = -4.5, n2 = 3.9, n3 = 2.5;
 * 
 * if( n1 >= n2 && n1 >= n3)
 * System.out.println(n1 + " is the largest number.");
 * 
 * else if (n2 >= n1 && n2 >= n3)
 * System.out.println(n2 + " is the largest number.");
 * 
 * else
 * System.out.println(n3 + " is the largest number.");
 * }
 * }
 */

/*
 * public class Largest {
 * 
 * public static void main(String[] args) {
 * 
 * double n1 = -4.5, n2 = 3.9, n3 = 5.5;
 * 
 * if(n1 >= n2) {
 * if(n1 >= n3)
 * System.out.println(n1 + " is the largest number.");
 * else
 * System.out.println(n3 + " is the largest number.");
 * } else {
 * if(n2 >= n3)
 * System.out.println(n2 + " is the largest number.");
 * else
 * System.out.println(n3 + " is the largest number.");
 * }
 * }
 * }
 */
