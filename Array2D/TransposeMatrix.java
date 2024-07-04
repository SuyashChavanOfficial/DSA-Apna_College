package Array2D;

public class TransposeMatrix {

    public static void transposeMatrix(int arr[][]) {

        int row = arr.length, col = arr[0].length;
        int transposeArray[][] = new int[col][row];

        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                transposeArray[j][i] = arr[i][j];
            }
        }

        for(int i=0; i<col; i++) {
            for(int j=0; j<row; j++) {
                System.out.print(transposeArray[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        
        int matrix[][] = {
            {1, 2, 3},
            {4, 5, 10},
        };

        transposeMatrix(matrix);

        
    }
}
