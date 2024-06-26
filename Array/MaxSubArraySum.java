package Array;

public class MaxSubArraySum {

    public static int maxSubArraySum(int arr[]) {

        int maxSum = Integer.MIN_VALUE, largestSum = 0;

        // for first number selection
        for (int i = 0; i < arr.length; i++) {

            // for subarray begin
            for (int j = i; j < arr.length; j++) {

                largestSum = 0;

                // adding elements to the subarray
                for (int k = i; k <= j; k++) {
                    largestSum += arr[k];
                }
                System.out.println(largestSum);

                if (largestSum > maxSum) {
                    maxSum = largestSum;
                }
            }
        }

        return maxSum;
    }

    public static int prefixMethod(int arr[]) {
        int n = arr.length, currSum = 0, maxSum = Integer.MIN_VALUE;
        int prefixArr[] = new int[n] ;
        prefixArr[0] = arr[0];


        for (int i = 1; i < n; i++) {
            prefixArr[i] = prefixArr[i-1] + arr[i];
        }

        for(int i=0; i<n; i++) {
            int start = i;

            for(int j = i; j<n; j++) {
                int end = j;

                currSum = start == 0 ? prefixArr[end] : (prefixArr[end] - prefixArr[start - 1]);

                if(currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int numbers[] = { 23, -45, 12, 334, 36, 34 };

        System.out.println("Maximum sum: " + maxSubArraySum(numbers));

        System.out.println("Prefix Method sum: " + prefixMethod(numbers));
    }
}
