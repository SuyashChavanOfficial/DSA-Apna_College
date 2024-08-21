package Strings;

import java.util.Scanner;

public class StringPalindrome {
    
    public static Boolean stringPalindrome(String str) {

        int n = str.length();
        int start = 0, end = n-1;
        while(start < end) {
            if(str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String palString = sc.next();

        if(stringPalindrome(palString)) {
            System.out.println(palString + " is palindrome");
        } else {
            System.out.println(palString + " is no palindrome");  
        }

        sc.close();
    }
}
