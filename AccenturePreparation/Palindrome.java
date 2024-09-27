package AccenturePreparation;

import java.util.ArrayList;

public class Palindrome {
    public static boolean palString(String s) {

        int start = 0, end=s.length()-1;
        
        while(start <= end) {
            if(s.charAt(start) != s.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static boolean palNum(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int start =0, end = 0;
        while(n!=0) {
            int rem = n % 10;
            list.add(rem);
            n /= 10;
            end++;
        }

        while(start <= end) {
            if(list.get(start) != list.get(end-1)){
                return false;
            }

            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        // String str = "poop";
        // String str1 = "Suyash";
        int num = 1001;
        int num1 = 1002;

        // System.out.println(palString(str));
        // System.out.println(palString(str1));

        System.out.println(palNum(num));
        System.out.println(palNum(num1));
    }
}
