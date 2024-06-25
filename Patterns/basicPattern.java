package Patterns;

public class basicPattern {

    public static void main(String[] args) {

        // * 

        // * * 

        // * * * 

        // * * * * 

        // for(int i=0; i<4; i++) {
        //     for(int j=0; j<=i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println("\n");
        // }

        // * * * * 

        // * * * 

        // * * 

        // *

        // for(int i=4; i>0; i--) {
        //     for(int j=0; j<i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println("\n");
        // }

        // 1

        // 12

        // 123

        // 1234

        // for(int i=1; i<=4; i++) {
        //     for(int j=1; j<=i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println("\n");
        // }

        // A

        // BC

        // DEF

        // GHIJ

        char ch = 'A';

        for(int i = 0; i<4; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println("\n");
        }
    }
    
    
}
