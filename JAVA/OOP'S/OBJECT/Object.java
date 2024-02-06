//package OOP'S.OBJECT;

public class Object {
    int id;
    String name;

    Object(int i, String s) {
        id = i;
        name = s;
    }

    Object(Object s) {
        id = s.id;
        name = s.name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Object s1 = new Object(111, "john");
        Object s2 = new Object(222, "kavitha");
        s1.display();
        s2.display();
    }
}
