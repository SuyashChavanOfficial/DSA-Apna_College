package Array;

public class BinarySearch {

    public static int binarySearch(int arr[], int key) {
        int start = 0, end = arr.length-1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (key == arr[mid]) {
                return mid;
            } else {
                if (key > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {23, 45, 12, 334, 36, 34};

        int index = binarySearch(numbers, 36);

        if(index != -1) {
            System.out.println("Key found at: " + index);
        } else {
            System.out.println("Key not found!");
        }
    }
}
