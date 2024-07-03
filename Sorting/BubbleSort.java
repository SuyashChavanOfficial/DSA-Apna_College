package Sorting;

public class BubbleSort {

    public static void bubbleSort(int arr[]) {

        for(int turn=0; turn<arr.length-1; turn++) {
            for(int i=0; i<arr.length-1-turn; i++) {
                if(arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
    
    public static void main(String[] args) {
        int numbers[] = {6, 4, 2, 5, 3, 7};

        bubbleSort(numbers);
    }
}
