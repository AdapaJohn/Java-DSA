package DESCISIONMAKINGSTATEMENTS;

public class NestedifStatement {
    public static void main(String[] args) {
        int age = 20;
        int weight = 80;
        if(age >=18){
            if (weight>50) {
                System.out.println("You are eligible donate blood");
            }
            else{
                System.out.println("not eligible");
            }
        }
        else{
            System.out.println("you are a kid");
        }
    }
}
