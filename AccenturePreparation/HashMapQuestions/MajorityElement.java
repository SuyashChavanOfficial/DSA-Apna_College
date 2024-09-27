package AccenturePreparation.HashMapQuestions;

import java.util.HashMap;

// Given an array of integers with size n, find all elements that appears n/3 times. 
public class MajorityElement {
    public static void majorityElement(int arr[]) {
        int freq = arr.length/3;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int nums : arr) {
            if(map.containsKey(nums)) {
                map.put(nums, map.get(nums) + 1);
            } else {
                map.put(nums, 1);
            }
        }

        // Create a keySet to get all the keys 
        for(int key : map.keySet()) {
            if(map.get(key) >= freq) {
                System.out.println(key);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 3, 3, 4, 5, 5, 5, 5};

        majorityElement(arr);
    }

}
