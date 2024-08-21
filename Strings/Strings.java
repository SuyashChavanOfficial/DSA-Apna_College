package Strings;

import java.util.Scanner;

public class Strings {
    
    public static void main(String[] args) {
        
        // Two ways of initiating string 
        String fName1 = "Tony";
        // String fName2 = new String("Stark");

        Scanner sc = new Scanner(System.in);

        String lName1 = sc.next(); // Takes one word as input
        // String lName2 = sc.nextLine(); // Takes word/sentence/paragraph as input

        // CONCATENATION

        String fullName = fName1 + " " + lName1;

        System.out.println(fullName);

        char fNameChar = fullName.charAt(0); // Prints character in string fullName at position 0

        System.out.println(fNameChar);

        sc.close();
    }
}
