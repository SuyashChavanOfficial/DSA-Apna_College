package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void checkAnagram(String str1, String str2) {
        str1.toLowerCase();
        str2.toLowerCase();
        
        if(str1.length() == str2.length()) {
            char[] str1CharArray = str1.toCharArray();
            char[] str2CharArray = str2.toCharArray();

            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);

            if(Arrays.equals(str1CharArray, str2CharArray)) {
                System.out.println("Strings are Anagram");
            } else {
                System.out.println("Strings are not an Anagram");
            }
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String 1:");
        String str1 = sc.nextLine();
        System.out.print("Enter String 2:");
        String str2 = sc.nextLine();

        checkAnagram(str1, str2);

        sc.close();
    }
}
