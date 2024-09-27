package AccenturePreparation;

public class equilibriumPoint {

    public static int equiPoint(int arr[], int n) {
        
        int lSum = 0, rSum = 0;

        for(int i=0; i<n; i++) {
            rSum += arr[i];
        }

        for(int i=0; i<n; i++) {
            rSum -= arr[i];

            if(lSum == rSum) {
                return i;
            } else {
                lSum += arr[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {3, 1, 1, 2};
        int n = arr.length;

        System.out.println(equiPoint(arr, n));
        
    }
}
