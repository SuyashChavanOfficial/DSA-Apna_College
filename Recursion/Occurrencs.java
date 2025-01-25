public class Occurrencs {
    public static int firstOccurrence(int[] arr, int target, int i) {
        if(i == arr.length) return -1;
        if(arr[i] == target) return i;

        return firstOccurrence(arr, target, i+1);
    }

    public static int lastOccurrence(int[] arr, int target, int i) {
        if(i == arr.length) {
            return -1;
        }

        int isFound = lastOccurrence(arr, target, i+1);

        if(isFound == -1 && arr[i] == target) {
            return i;
        }

        return isFound;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 5};

        System.out.println(lastOccurrence(arr, 3, 0));
        
    }
}
