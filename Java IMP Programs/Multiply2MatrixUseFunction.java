public class Multiply2MatrixUseFunction {
    public static void main(String[] args) {
        int r1=2,c1=3;
        int r2=3,c2=2;
        int[][] first={{1,2,3},{4,5,6}};
        int[][] second={{4,5},{6,7},{8,9}};

        //multiply 2 matrices
        int[][] product=multiplyMatrices(first,second,r1,c1,c2);
        displayProduct(product);
    }

    public static void displayProduct(int[][] product) {
        System.out.println("Product of 2 matrix is: ");
        for (int[] row : product) {
            for (int column : row) {
                System.out.print(column+" ");
            }
            System.out.println();
        }

    }

    public static int[][] multiplyMatrices(int[][] first, int[][] second,int r1,int c1,int c2) {
        int[][] product=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    product[i][j]+=first[i][k]*second[k][j];
                }
            }
        }
        return product;
    }
}
