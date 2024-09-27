package AccenturePreparation;

public class August14Question {

    public static int favSongs(String S, int k) {

        int maxSongs = 0;

        for(int i=0; i<=S.length()-k; i++) {
            int currMaxSongs = 0;
            for(int j=i; j<i+k; j++) {
                if(S.charAt(j) == 'a') {
                    currMaxSongs++;
                }
            }

            maxSongs = Math.max(currMaxSongs, maxSongs);
        }

        return maxSongs;
    }
    
    public static void main(String[] args) {
        String songs = "abcaca";
        int k = 3;

        System.out.println(favSongs(songs, k));
        
    }
}
