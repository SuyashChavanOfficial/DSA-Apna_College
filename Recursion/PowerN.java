public class PowerN {
    
    public static int powerOfN (int n, int power) {
        if(power == 1) {
            return 1;
        }

        return n * powerOfN(n, power-1);
    }

    public static int optimisedPower (int n, int power) {
        if(power == 0) {
            return 1;
        }

        int halfPower = optimisedPower(n, power/2);
        int halfPowerSq = halfPower * halfPower;

        if(power%2 != 0) {
            return  n * halfPowerSq;
        } 
        
        return halfPowerSq;
    }

    public static void main(String[] args) {
        System.out.println(optimisedPower(9, 3));
    }
}
