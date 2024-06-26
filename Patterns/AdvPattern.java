package Patterns;

public class AdvPattern {

    // * * * * *
    // * *
    // * *
    // * * * * *

    public static void hollowRectangle(int row, int col) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }

    // *
    // * *
    // * * *
    // * * * *
    // * * * * *

    public static void invertedPyramid(int row) {
        for (int i = 1; i <= row; i++) {
            // FOR SPACE
            for (int j = 1; j <= (row - i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    // 1 2 3 4 5
    // 1 2 3 4
    // 1 2 3
    // 1 2
    // 1

    public static void invertedHalfPyraWithNum(int row) {
        for (int i = row; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
    }

    // FLOYD'S TRIANGLE

    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10
    // 11 12 13 14 15

    public static void floydTraingle(int row) {
        int counter = 1;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    // 1
    // 0 1
    // 0 1 0
    // 1 0 1 0
    // 1 0 1 0 1

    public static void traingle01(int row) {
        boolean result = true;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                if (result) {
                    System.out.print("1 ");
                    result = !result;
                } else {
                    System.out.print("0 ");
                    result = !result;
                }
            }
            System.out.println();
        }
    }

    // BUTTERFLY PATTERN

    // * *
    // ** **
    // *** ***
    // **** ****
    // **********
    // **********
    // **** ****
    // *** ***
    // ** **
    // * *

    public static void butterfly(int row) {
        // First half
        for (int i = 1; i <= row; i++) {

            // for starts
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // for spaces

            for (int j = 1; j <= (2 * (row - i)); j++) {
                System.out.print(" ");
            }

            // for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Second Half
        for (int i = row; i > 0; i--) {
            // for starts
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // for spaces

            for (int j = 1; j <= (2 * (row - i)); j++) {
                System.out.print(" ");
            }

            // for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // SOLID RHOMBUS

    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *

    public static void solidRhombus(int row) {
        for (int i = 1; i <= row; i++) {
            // for spaces
            for (int j = (row - i); j > 0; j--) {
                System.out.print(" ");
            }

            // for stars
            for (int j = 1; j <= row; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    // HOLLOW RHOMBUS

    // *****
    // * *
    // * *
    // * *
    // *****

    public static void hollowRhombus(int row) {

        for (int i = 1; i <= row; i++) {

            // for spaces
            for (int j = 1; j <= (row - i); j++) {
                System.out.print("  ");
            }

            // for stars
            for (int j = 1; j <= row; j++) {
                if (i == 1 || j == 1 || i == row || j == row) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

    }

    // DIAMOND PATTERN

        //       * 
        //     * * * 
        //   * * * * * 
        // * * * * * * * 
        // * * * * * * * 
        //   * * * * * 
        //     * * * 
        //       * 

    public static void diamond(int row) {

        // for first half
        for (int i = 1; i <= row; i++) {

            // for spaces
            for (int j = (row - i); j > 0; j--) {
                System.out.print("  ");
            }

            // for stars
            for (int j=1; j <= (i*2-1); j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // for second half
        for (int i = row; i > 0; i--) {
            // for spaces
            for (int j = (row - i); j > 0; j--) {
                System.out.print("  ");
            }

            // for stars
            for (int j=1; j <= (i*2-1); j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        // hollowRectangle(5, 10);
        // invertedPyramid(5);
        // invertedHalfPyraWithNum(5);
        // floydTraingle(5);
        // traingle01(5);
        // butterfly(5);
        // solidRhombus(5);
        // hollowRhombus(5);
        diamond(4);
    }
}
