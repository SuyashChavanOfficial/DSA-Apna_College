package Array;

public class TrappingRainwater {

    public static int trappedRainwater(int arr[]) {

        // Time complexity if O(n) 
        
        int n = arr.length, trappedWater = 0;
        int leftMax[] = new int[n]; 
        int rightMax[] = new int[n];

        leftMax[0] = arr[0];
        rightMax[n - 1] = arr[n - 1];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i-1], arr[i]);
        }

        for(int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], arr[i]);
        }

        for(int i=1; i<n-1; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - arr[i];
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int bars[] = {4, 2, 0, 6, 3, 2, 5};

        System.out.println("Trapped rainwater is: " + trappedRainwater(bars));
        
    }
}
