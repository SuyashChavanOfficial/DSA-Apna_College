package AccenturePreparation;

public class ReverseString {
    public static String revString(String str) {
        // StringBuilder str1 = new StringBuilder();

        String str1 = "";
        for(int i=str.length()-1; i>=0; i--) {
            str1 += str.charAt(i); 
            // str1.append(str.charAt(i));
        }

        return str1;
    }

    public static void main(String[] args) {
        String str = "poop223";
        
        System.out.println(revString(str));
    }
}
