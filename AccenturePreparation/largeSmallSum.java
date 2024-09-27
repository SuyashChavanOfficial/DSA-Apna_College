package AccenturePreparation;

import java.util.Scanner;

public class largeSmallSum {
    public static int largeElSmallElSum(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secSmallest = Integer.MAX_VALUE;
        
        if(arr.length <= 3) {
            return 0;
        }

        for(int i=0; i<arr.length; i++) {
            if(i%2 == 0) {
                if(arr[i] > largest) {
                    secLargest = largest;
                    largest = arr[i];
                } else if(arr[i] > secLargest && arr[i] < largest) {
                    secLargest = arr[i];
                }
            } else {
                if(arr[i] < smallest) {
                    secSmallest = smallest;
                    smallest = arr[i];
                } else if(arr[i] < secSmallest && arr[i] > smallest) {
                    secSmallest = arr[i];
                }
            }
        }

        return secLargest + secSmallest;
    }

    public static void main (String[]args) 
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();
        int arr[] = new int[n]; 
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt ();

        System.out.println (largeElSmallElSum(arr));

        sc.close();
    } 
}
