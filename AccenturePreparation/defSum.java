package AccenturePreparation;

import java.util.Scanner;

public class defSum {
    public static int deffSum(int m, int n) {
        int divSum = 0, nDivSum = 0;

        for (int i = 1; i <= m; i++) {
            if (i % n == 0) {
                divSum += i;
            } else {
                nDivSum += i;
            }
        }

        return nDivSum - divSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(deffSum(m, n));

        sc.close();
    }
}
