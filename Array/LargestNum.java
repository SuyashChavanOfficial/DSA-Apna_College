package Array;

// FINDING LARGEST NUMBER IN THE ARRAY 
public class LargestNum {
    public static int largestNum(int arr[]) {
        int largestNum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > largestNum) {
                largestNum = arr[i];
            }
        }

        return largestNum;
    }

    public static void main(String[] args) {
        int numbers[] = {23, 45, 12, 334, 36, 34};

        System.out.println("Largest number in the array is: " + largestNum(numbers));
    }
}
