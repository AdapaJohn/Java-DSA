package METHODS;

public class ReturnType {
    
    //Type 1
    public int CompareNum() {
        int x = 3, y = 8;
        System.out.println("X=" + x + "\ny=" + y);
        if (x > y)
            return x;
        else
            return y;
    }

    //Type 2
    static int sai(){
        return 10;
    }

    public static void main(String[] args) {

        //Type 2
        System.out.println("Hi");
        int i = sai();
        System.out.println(i);

        //Type 1
        ReturnType obj = new ReturnType();
        int result = obj.CompareNum();
        System.out.println("Greater value:" + result);
    }
}
