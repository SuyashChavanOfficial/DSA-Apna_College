package Functions;

import java.util.Scanner;

public class BinToDec {

    public static int binToDec(int bin) {

        int dec = 0, power = 0;;
        
        while(bin > 0) {
            
            int lastDigit = bin % 10;
            dec += (lastDigit * (int)Math.pow(2, power));
            power++;
            bin /= 10;
        }

        return dec;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter binary number: ");
        int bin = sc.nextInt();

        System.out.println("Decimal of " + bin + " is: " + binToDec(bin));

        sc.close();
    }
}
