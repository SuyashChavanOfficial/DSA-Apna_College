import java.util.Scanner;

public class else_if {
 public static void main(String[] args) {
    int tax = 0, income;

    Scanner sc = new Scanner(System.in);
    income = sc.nextInt();

    if(income < 500000) {
        tax = 0; 
    } else if(income >= 500000 && income < 1000000) {
        tax = (int)(income * 0.20);
    } else if(income >= 1000000) {
        tax = (int)(income * 0.30);
    } else {
        System.out.println("Enter valid amount");
    }

    System.out.println("Your tax is: " + tax);
    sc.close();
 }   
}
