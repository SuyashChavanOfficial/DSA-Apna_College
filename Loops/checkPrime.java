package Loops;

import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check if it is prime or not: ");
        int num = sc.nextInt();

        boolean isPrime = true;

        if (num == 2) {
            System.out.println("2 is Prime!");
        } else {
            for (int i = 2; i <= (num - 1); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    System.out.println(num + " is not Prime");
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num + " is Prime!");
            }
        }

        sc.close();
    }
}
