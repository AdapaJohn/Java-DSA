public class Multiply2MatrixUse3D {
    public static void main(String[] args) {
        int r1=2,c1=3;
        int r2=3,c2=2;
        int[][] first={{1,2,3},{3,4,5}};
        int[][] second={{5,6,7},{7,8,9}};

        //multiply 2 matrix
        int[][] product=new int[r1][c2];
        for(int i=0;i<r1;i++) {
            for(int j=0;j<c2;j++) {
                for(int k=0;k<c2;k++) {
                    product[i][j] +=first[i][k]*second[k][j];
                }
            }
        }

        //display
        System.out.println("Multiplication of 2 matrices: ");
        for (int[] row : product) {
            for (int column : row) {
                System.out.print(column +"   ");
            }
            System.out.println();
        }
    }
}
