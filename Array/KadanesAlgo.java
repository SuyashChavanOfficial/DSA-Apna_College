package Array;

public class KadanesAlgo {
    
    public static int kadanesAlgo(int arr[]) {

        int currSum = 0, maxSum = Integer.MIN_VALUE, maxNegative = Integer.MIN_VALUE, counter=0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > 0) {
                break;
            } else {
                maxNegative = Math.max(maxNegative, arr[i]);
                counter++;
            }
        }

        if(counter == arr.length) {
            return maxNegative;
        } else {
            for(int i=0; i<arr.length; i++) {
                currSum += arr[i];
                if(currSum < 0) {
                    currSum = 0;
                }
                maxSum = Math.max(maxSum, currSum);
            }

            return maxSum;
        }

    }

    public static void main(String[] args) {
        int numbers[] = { -23, -45, 12, 334, -36, -34 };

        System.out.println("Max sum is: " + kadanesAlgo(numbers));
    }
}
