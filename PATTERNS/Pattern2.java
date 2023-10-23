public class Pattern2 {
    public static void main(String[] args) {
        int n=5;
        print1(n);
    }
    static void print1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
