package Array;

public class ReverseArray {

    public static void reverseArray(int arr[]) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        
        int numbers[] = {23, 45, 12, 334, 36, 34};

        reverseArray(numbers);

        for(int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
