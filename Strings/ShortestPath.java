package Strings;

public class ShortestPath {

    public static void shortestPath(String path, int x, int y) {

        int n = path.length();

        for (int i = 0; i < n; i++) {

            char dir = path.charAt(i);
            if (dir == 'E') {
                x++;
            } else if (dir == 'S') {
                y--;
            } else if (dir == 'W') {
                x--;
            } else {
                y++;
            }
        }

        float finalPath = (float)Math.sqrt((x * x) + (y * y));

        System.out.println("The shortest path for the given path is: " + finalPath);
    }

    public static void main(String[] args) {
        
        String path = "WENESWENSWENSS";

        shortestPath(path, 0, 0);
    }
}
