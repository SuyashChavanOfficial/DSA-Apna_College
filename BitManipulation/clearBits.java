package BitManipulation;

// Clear i bits from the end
public class clearBits {
    
    public static int clearIBits(int num, int i) {
        int bitmask = (~0 << i);

        return num & bitmask;
    }

    public static void main(String[] args) {
        System.out.println(clearIBits(7, 2));
       
    }
}
