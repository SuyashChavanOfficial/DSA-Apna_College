import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Choose character to perform operation:\n1. +\n2. -\n3. *\n4. /\n5. %");
        char opt = sc.next().charAt(0);

        switch (opt) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;

            case '-':
                System.out.println("Result: " + (a - b));
                break;

            case '*':
                System.out.println("Result: " + (a * b));
                break;

            case '/':
                System.out.println("Result: " + (a / b));
                break;

            case '%':
                System.out.println("Result: " + (a % b));
                break;

            default:
                System.out.println("Invalid Input");
                break;
        }

        sc.close();
    }
}
