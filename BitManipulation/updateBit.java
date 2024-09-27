package BitManipulation;

public class updateBit {
    public static int setIthBit(int num, int position) {

        int bitmask = 1 << position;

        return num | bitmask;
    }

    public static int clearIthBit(int num, int position) {
        int bitmask = ~(1 << position);

        return num & bitmask;
    }

    public static int updateIthBit(int num, int i, int newBit) {
        if(newBit == 0) {
            return clearIthBit(num, i);
        } else {
            return setIthBit(num, i);
        }
    }

    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 0, 1));
    }
}
