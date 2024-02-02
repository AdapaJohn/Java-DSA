class CalculatePower {
  public static void main(String[] args) {

    int base = 2, exponent = 3;

    //long result = 1;

    // for (; exponent != 0; --exponent) {
    //     result *= base;
    //   }

    double result = Math.pow(base, exponent);

    // while (exponent != 0) {
    //   result *= base;
    //   --exponent;
    // }

    System.out.println("Answer = " + result);
  }
}