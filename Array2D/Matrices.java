package Array2D;

import java.util.Scanner;

public class Matrices {
    
    public static void main(String[] args) {
        
        int matrix[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);

        int row = matrix.length, col = matrix[0].length;

        for(int i=0; i<row; i++) {
            for(int j= 0; j<col; j++) {
                System.out.print("Enter element for row = " + i + " col = " + j + ": ");
                matrix[i][j] = sc.nextInt();
            }
        }


        System.out.println("\n2D Matrix Array: ");

        for(int i=0; i<row; i++) {
            for(int j= 0; j<col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
