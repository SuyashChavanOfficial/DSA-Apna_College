package Array;

public class PractiseQuestions {
    // Que 1:
    public static boolean uniqueArray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    // Que 4

    public static int trappedWater(int arr[]) {

        int n = arr.length, trappedWater = 0;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];

        leftMax[0] = arr[0];
        rightMax[n - 1] = arr[n - 1];

        for (int i = 1; i < n - 1; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }

        for(int i=1; i<n-1; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - arr[i];
        }

        return trappedWater;
    }

    // Que 5
    public static void triplet(int arr[]) {

        int n = arr.length;
        System.out.print("[");
        for(int i=0; i<n-2; i++) {
            for(int j=i+1; j<n-1; j++) {
                for(int k=j+1; k<n; k++) {
                    if((arr[i] + arr[j] + arr[k]) == 0) {
                        System.out.println(arr[i] + "," + arr[j] + "," + arr[k]);
                    }
                }
            }
        }
        System.out.print("]");

        // Not the correct approach but tried it. Actual answer is somewhat similar to my answer but they have used hashsets and all!
    }

    public static void main(String[] args) {
        
        // int nums[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        // System.out.println(uniqueArray(nums));

        // int waterLevel[] = {4, 2, 0, 3, 2, 5}; 
        // System.out.println("Trapped water: " + trappedWater(waterLevel));

        int nums[] = {-1, 0, 1, 2, -1, -4};
        triplet(nums);
    }
}
