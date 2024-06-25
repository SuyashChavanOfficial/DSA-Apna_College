package Loops;

import java.util.Scanner;

public class practiseQue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // FACTORIAL OF A NUMBER 
        // System.out.println("Enter num to find factorial: ");
        // int num = sc.nextInt(), result = 1, countNum = num;

        // while(countNum > 0) {
        //     result *= countNum;
        //     countNum--;
        // }

        // System.out.println("Factorial of " + num + " is: " + result);

        // MULTIPLICATION TABLE OF A NUMBER

        System.out.println("Enter number to print multiplication table: ");
        int num = sc.nextInt();
        
        for(int i = 1; i<=10; i++) {
            System.out.println(num + " * " + i +" = " + (num*i));
        }

        sc.close();
    }
}
