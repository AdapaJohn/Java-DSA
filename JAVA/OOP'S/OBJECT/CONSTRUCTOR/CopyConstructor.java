//package Java-DSA.JAVA.OOP'S.OBJECT.CONSTRUCTOR;

public class Constructor {
    private double real, imag;

    public Constructor(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    Constructor(Constructor obj) {
        System.out.println("CopyConstructor called");
        real = obj.real;
        imag = obj.imag;
    }

    public String toString() {
        return "(" + real + "+" + imag + "i)";
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Constructor c1 = new Constructor(10, 15);
        Constructor c2 = new Constructor(c1);
        Constructor c3 = c2;
        System.out.println(c2);
    }
}
