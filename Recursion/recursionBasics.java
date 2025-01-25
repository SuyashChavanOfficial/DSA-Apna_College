class recursionBasics {
    public static void main(String args[]) {
        int n = 10;
        printDecreasing(n);
        System.out.println();
        printIncreasing(n);
    }

    public static void printIncreasing(int n) {
        if(n==1) {
            System.out.print(n + " ");
            return;
        }

        printIncreasing(n - 1);
        System.out.print(n + " ");
    }

    public static void printDecreasing(int n) {
        if(n == 1) {
            System.out.print(n);
            return;
        }

        System.out.print(n + " ");
        printDecreasing(n - 1);
    }
}