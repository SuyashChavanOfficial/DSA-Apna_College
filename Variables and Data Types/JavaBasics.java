import java.util.*;

public class JavaBasics {
    // public class name and file name should be same
    public static void main(String args[]) {
        // Every java file should have a public class and main function
        // This is the Boilerplate code
        
        // Output 
        // System.out.println("Hello World!");

        // To take input from the user
        Scanner sc = new Scanner(System.in);

        // SUM OF a, b
        // System.out.print("Enter value of a: ");
        // int a = sc.nextInt();
        // System.out.print("Enter value of b: ");
        // int b = sc.nextInt();
        // int sum = a + b;
        // System.out.println("Sum of a, b is: " + sum);

        // AREA OF CIRCLE
        System.out.print("Enter radius: ");
        int r = sc.nextInt();
        float area = 22 / 7 * r * r;
        System.out.println("Area of circle is: " + area);
    }
}