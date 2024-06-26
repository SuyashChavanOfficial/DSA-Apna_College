package Functions;

import java.util.Scanner;

public class DecToBin {

    public static int decToBin(int decNum) {
        int power = 0, binNum = 0;

        while(decNum > 0) {
            int lastDigit = decNum % 2;
            binNum += lastDigit * (int)Math.pow(10, power);
            power++;
            decNum /= 2;
        }

        return binNum;

        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Decimal Number");
        int decNum = sc.nextInt();

        System.out.println("Decimal number is: " + decToBin(decNum));

        sc.close();

    }
}
