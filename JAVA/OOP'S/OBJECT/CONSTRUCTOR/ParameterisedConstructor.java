//package Java-DSA.JAVA.OOP'S.OBJECT.CONSTRUCTOR;

public class ParameterisedConstructor {
    int id;
    String name;

    ParameterisedConstructor(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("ID : " + id);
    }

    public static void main(String[] args) {
        ParameterisedConstructor obj1 = new ParameterisedConstructor(501, "John");
        ParameterisedConstructor obj2 = new ParameterisedConstructor(510, "Rohith");
        obj1.display();
        obj2.display();
    }
}
