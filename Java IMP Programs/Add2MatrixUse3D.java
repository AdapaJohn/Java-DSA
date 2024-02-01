public class Add2MatrixUse3D {
    public static void main(String[] args) {
        int rows=2,columns=3;
        int[][] first={{1,2,3},{4,5,6}};
        int[][] second={{1,2,3},{4,5,6}};

        //Add 2 matrices
        int[][] sum=new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                sum[i][j] = first[i][j]+second[i][j];
            }
        }

        //Display
        System.out.println("Sum of 2 matrices is: ");
        for (int[] row : sum) {
            for (int column : row) {
                System.out.print(column + "  ");
            }
            System.out.println();
        }
    }
}
