package Array;

import java.util.Scanner;

public class BasicArray {
    public static void main(String[] args) {
        // CREATING ARRAY 
        int marks[] = new int[10];

        // TAKING INPUTS
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Physics marks: ");
        marks[0] = sc.nextInt();
        System.out.print("Chemistry marks: "); 
        marks[1] = sc.nextInt();
        System.out.print("Biology marks: "); 
        marks[2] = sc.nextInt();

        System.out.println("Marks: \n1. Physics: " + marks[0] + "\n2. Chemistry: " + marks[1] + "\n3.Biology: " + marks[2]);

        //FINDING LENGTH OF ARRAY
        int arrLength = marks.length;
        System.out.println("Length of array is: " + arrLength);

        sc.close();
    }
}
