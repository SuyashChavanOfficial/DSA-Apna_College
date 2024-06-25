package Loops;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Print numbers from 1 to n
        // System.out.print("Numbers should be printed till: ");
        // int num = sc.nextInt(), counter = 1;

        // while(counter <= num) {
        //     System.out.println(counter);
        //     counter++;
        // }

        //Print sum of n natural numbers
        int sum = 0, counter = 1;
        
        System.out.print("Enter number to find sum: ");
        int naturalNum = sc.nextInt();

        
        while(counter <= naturalNum) {
            sum += counter;
            counter++;
        }

        System.out.println("Sum of first " + naturalNum + " natural numbers is: " + sum);
        sc.close();
    }
}
