package Array2D;

// Search a key in the sorted matrix 

public class SearchMatrix {

    public static void staircaseSearch(int arr[][], int key) {
        int row = arr.length-1, col = 0;

        while (row >= 0 && col < arr[0].length) {
            if (key == arr[row][col]) {
                System.out.println("Key found at: " + row + "," + col);
                return;
            } else if (key > arr[row][col]) {
                col++;
            } else  {
                row--;
            }
        }

        System.out.println("Key not found!");
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 5, 3 },
                { 4, 7, 10 },
                { 7, 10, 9 },
        };

        staircaseSearch(matrix, 10);
    }
}
