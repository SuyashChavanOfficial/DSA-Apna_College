package AccenturePreparation;

import java.util.ArrayList;

public class PrimeNumbers {
    
    public static void primeNum(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        // list.add(1);
        list.add(2);
        
        for(int num = 3; num <= n; num++) {
            if(isPrime(num)) {
                list.add(num);
            }
        }
        
        for(int prime : list) {
            System.out.println(prime);
        }   
        
    }

    public static boolean isPrime(int n) {
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        
        int num = 25;
        
        primeNum(num);
    }
}
