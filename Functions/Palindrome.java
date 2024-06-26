package Functions;

import java.util.Scanner;

public class Palindrome {

    public static boolean checkPalindrome(int num) {
        int palindrome = num, reverse = 0;

        while(palindrome > 0) {
            int lastDigit = palindrome % 10;
            reverse = reverse * 10 + lastDigit;
            palindrome /= 10;
        }

        if(reverse == num) {
            return true;
        }

        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        if(checkPalindrome(num)) {
            System.out.println(num +" is Palindrome");
        } else {
            System.out.println(num +" is not a Palindrome");
        }

        sc.close();
    }
}
