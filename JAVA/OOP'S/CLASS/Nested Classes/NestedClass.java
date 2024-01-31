//package OOP'S.CLASS.Nested Classes

class OuterClass {   // not include any access modifier
    int x = 10;

    class InnerClass {         // not include any access modifier
        int y = 5;
    }
}

public class NestedClass {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}
