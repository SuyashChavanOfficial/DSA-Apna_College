package Functions;

import java.util.Scanner;

// FIND THE SUM OF THE DIGITS OF AN INTEGER

public class DigitSum {

    public static int digitSum(int num) {
        int sum = 0;

        while(num>0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.println("Sum of digits is: " + digitSum(num));

        sc.close();
    }
}
