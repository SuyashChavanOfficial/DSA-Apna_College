package Loops;

import java.util.Scanner;

public class breakQue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("Enter number: ");
            num = sc.nextInt();
            System.out.println(num);
        } while (num % 10 != 0);

        sc.close();

    }
}
