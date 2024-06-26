package Functions;

import java.util.Scanner;

public class Factorial {

    public static int numFactorial(int a) {

        int fact = 1;

        if (a == 0) {
            return 1;
        } else {
            for (int i = a; i > 0; i--) {
                fact *= i;
            }
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to find factorial: ");
        int a = sc.nextInt();

        System.out.println("Factorial of " + a + " is: " + numFactorial(a));

        sc.close();
    }
}
