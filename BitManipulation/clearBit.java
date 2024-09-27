package BitManipulation;

public class clearBit {
    public static int clearIthBit(int num, int position) {
        int bitmask = ~(1 << position);

        return num & bitmask;
    }

    public static void main(String[] args) {
        System.out.println( clearIthBit(10, 1));
       
    }
}
