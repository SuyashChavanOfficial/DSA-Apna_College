package Array;

public class LinearSearch {

    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int marks[] = { 12, 324, 34345, 10, 56456, 34, 32 };
        int key = 10;

        int index = linearSearch(marks, key);
        if (index != -1) {
            System.out.println("Key found at index: " + index);
        } else {
            System.out.println("Key not found!");
        }
    }
}
