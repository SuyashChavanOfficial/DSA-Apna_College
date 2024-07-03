package Sorting;

public class CountingSort {

    public static void countingSort(int arr[]) {

        int arraySize = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            arraySize = Math.max(arraySize, arr[i]);
        }

        // Creating a new count array 
        int count[] = new int[arraySize + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int j = 0;

        // Sorting array elements 
        for(int i=0; i<count.length; i++) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

        // Printing array elements 
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        
        int numbers[] = {6, 4, 2, 5, 3, 2, 4, 7};

        countingSort(numbers);
    }
}
