public class LCM {
  public static void main(String[] args) {

    int n1 = 32, n2 = 80, gcd = 1;

    for(int i = 1; i <= n1 && i <= n2; ++i) {
      // Checks if i is factor of both integers
      if(n1 % i == 0 && n2 % i == 0)
        gcd = i;
    }

    int lcm = (n1 * n2) / gcd;     //LCM method remains GCD
    System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
  }
}
