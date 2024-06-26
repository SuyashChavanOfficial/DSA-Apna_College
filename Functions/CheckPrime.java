package Functions;

import java.util.*;;

public class CheckPrime {

    public static void checkPrime(int num) {

        if (num == 2) {
            System.out.println("2 is Prime");
            return;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    System.out.println(num + " is not Prime!");
                    return;
                }
            }
        }

        System.out.println(num + " is Prime");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = sc.nextInt();

        checkPrime(num);

        sc.close();
    }
}
