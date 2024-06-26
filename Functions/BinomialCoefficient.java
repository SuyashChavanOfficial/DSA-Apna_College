package Functions;

import java.util.Scanner;

public class BinomialCoefficient {

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

    public static int binCoefficient(int n, int r) {
        
        int binCoefficient = numFactorial(n)/(numFactorial(r) * numFactorial(n-r));

        return binCoefficient;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        System.out.println("Enter value of r: ");
        int r = sc.nextInt();

        System.out.println("Binomial Coefficient of " + n + " and " + r + " is: " + binCoefficient(n, r));

        sc.close();
    }
}
