package Functions;

import java.util.Scanner;

public class Product {

    public static void calculateProduct(int a, int b) {
        int product = a * b;
        System.out.println("Product of a and b is: " + product);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter value of b: ");
        int b = sc.nextInt();

        calculateProduct(a, b);

        sc.close();
    }
}
