package Loops;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {

        // * * * *
        // * * * *
        // * * * *
        // * * * *

        // for (int i = 0; i < 4; i++) {
        //     System.out.println("* * * *");
        // }

        // REVERSE OF A NUMBER
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to reverse: ");
        int num = sc.nextInt(), revNum = 0;

        while(num > 0) {
            int lastDigit = num % 10;
            revNum = (revNum * 10) + lastDigit;
            num /= 10;
        }

        System.out.println(revNum);

        sc.close();
    }
}
