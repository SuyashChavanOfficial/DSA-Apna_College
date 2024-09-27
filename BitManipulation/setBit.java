package BitManipulation;

public class setBit {
    public static int setIthBit(int num, int position) {

        int bitmask = 1 << position;

        return num | bitmask;
    }

    public static void main(String[] args) {
        System.out.println(setIthBit(10, 2));
    }
}
