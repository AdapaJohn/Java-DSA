public class ConstructorOverloading {
    int a,b,c,d;
    ConstructorOverloading(){
        a=10;
        b=20;
    }
    ConstructorOverloading(int x,int y){
        c=50;
        d=100;
    }
    void display1(){
        System.out.println(a);
        System.out.println(b);
    }
    void display2(){
        System.out.println(c);
        System.out.println(d);
    }
}
class Main{
    public static void main(String[] args) {
        ConstructorOverloading o1=new ConstructorOverloading();
        ConstructorOverloading o2=new ConstructorOverloading(50, 100);
        o1.display1();
        o2.display2();
    }
}
