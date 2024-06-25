import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.close();
        
        switch (choice) {
            case 1:
                System.out.println("Samosa");
                break;
            case 2:
                System.out.println("Vada Pav");
                break;
            case 3:
                System.out.println("Mango Shake");
                break;
        
            default:
                System.out.println("Invalid Input");
                break;
        }

    } 
}
