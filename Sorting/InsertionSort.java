package Sorting;

public class InsertionSort {

    public static void insertionSort(int arr[]) {

        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            int prev = i-1;

            while(prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }

            arr[prev+1] = curr;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 5, 4, 1, 3, 2 };

        insertionSort(numbers);
    }
}
