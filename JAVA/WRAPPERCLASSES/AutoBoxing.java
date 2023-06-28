package WRAPPERCLASSES;

public class AutoBoxing {
    public static void main(String[] args) {
        // create a primitive datatype
        int a = 5;
        double b = 567.76;
        // convert into a wrapper class
        Integer aObj = Integer.valueOf(a);
        Double bObj = Double.valueOf(b);
        if (aObj instanceof Integer) {
            System.out.println(a + ":" + aObj);
        }
        if (bObj instanceof Double) {
            System.out.println(b + " :" + bObj);
        }
    }
}
