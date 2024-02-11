//package Java-DSA.JAVA.OOP'S.OBJECT.METHODS.String Methods;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Kavitha";
        //String name = new String("Kavitha");  //try this also
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        int value = name.length();
        System.out.println(value);  //System.out.println(name.length());
        System.out.println(name.trim());  //removes the space
        System.out.println(name.substring(0, 2));
        System.out.println(name.substring(2));
        System.out.println(name.replace('K', 'J'));
        System.out.println(name.replaceAll("Kavitha", "varsita"));
        System.out.println(name.startsWith("Kavi"));
        System.out.println(name.endsWith("itha"));
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf('t'));
        System.out.println(name.lastIndexOf("tha"));
        System.out.println(name.equals("Joe"));
        System.out.println(name.equalsIgnoreCase("Kavitha"));  //Study on it from string length and diff name aspects
    }
}

//OUTPUT:
// kavitha
// KAVITHA
// 7
// Kavitha
// Ka
// vitha
// Javitha
// varsita
// true
// true
// v
// 4
// 4
// false
// true