package Functions;

import java.util.Scanner;

public class PrimeRange {
    public static boolean checkPrime(int num) {

        if (num == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }

        return true;

    }

    public static void rangePrime(int range) {
        for(int i=2; i<=range; i++) {
            if(checkPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter range: ");
        int range = sc.nextInt();

        rangePrime(range);

        sc.close();
    }
}
