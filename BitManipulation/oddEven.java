package BitManipulation;

import java.util.Scanner;

public class oddEven {
    public static void checkOddEven(int num) {
        // We will do bitmasking with 1
        int bitmask = 1;

        if((num & bitmask) == 1) {
            System.out.println(num + " is odd");
        } else {
            System.out.println(num + " is even");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        checkOddEven(num);

        sc.close();
    }
}
