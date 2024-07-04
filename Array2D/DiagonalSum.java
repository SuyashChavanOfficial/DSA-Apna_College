package Array2D;

public class DiagonalSum {

    public static void diagonalSum(int arr[][]) {

        int primarySum = 0, secondarySum = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            // Sum for primary diagonal
            primarySum += arr[i][i];

            // Sum for secondary diagonal
            if(i != n-1-i) {
                secondarySum += arr[i][n - 1 - i];
            }  
        }

        int diagonalSum = primarySum + secondarySum;

        System.out.println("Primary Sum: " + primarySum + "\nSecondary Sum: " + secondarySum);
        System.out.println("Diagonals Sum: " + diagonalSum);
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3},
            {4, 5, 10},
            {7, 10, 9}, 
            
        };

        diagonalSum(matrix);
    }
}
