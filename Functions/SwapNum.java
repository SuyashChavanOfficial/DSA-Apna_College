package Functions;

public class SwapNum {

    public static void swapNum(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("New value of a is: " + a);
        System.out.println("New value of b is: " + b);
    }
    
    public static void main(String[] args) {
        swapNum(5, 7);
    }
}
