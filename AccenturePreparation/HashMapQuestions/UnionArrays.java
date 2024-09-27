package AccenturePreparation.HashMapQuestions;

import java.util.*;

public class UnionArrays {
    public static int union(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<arr1.length; i++) {
            set.add(arr1[i]);
        }

        for(int i=0; i<arr2.length; i++) {
            set.add(arr2[i]);
        }

        for(int val : set) {
            System.out.println(val);
        }
        
        return set.size();
        
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 3, 5, 6};
        int arr2[] = {1, 2, 3, 3, 5, 6, 4, 7, 4, 2 , 5, 9};

        System.out.println(union(arr1, arr2));
    }
}
