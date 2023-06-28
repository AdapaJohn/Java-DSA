package WRAPPERCLASSES;

public class AutoUnBoxing {
    public static void main(String[] args) {
        // create Wrapper Object Class
        Integer aObj = Integer.valueOf(5);
        Double bObj = Double.valueOf(537.76);
        // convert primitive datatype
        int a = aObj.intValue();
        double b = bObj.doubleValue();
        System.out.println("value is " + a);
        System.out.println("value is " + b);
    }
}
