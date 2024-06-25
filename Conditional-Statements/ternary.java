import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // NUMBER IS EVEN OR ODD
        
        // int num = sc.nextInt();

        // String numType = (num % 2 == 0) ? "Even" : "odd";
        // System.out.println(numType);
        // sc.close();

        // STUDENT WILL PASS OR FAIL

        System.out.println("Enter marks: ");
        int marks = sc.nextInt();

        String result = marks>=33 ? "passed" : "failed";

        System.out.println("Student " + result + " the exam");

        sc.close();
    }
}
