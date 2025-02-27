package Strings;

public class ShortestPath {
    public static double shortestPath(String dir) {
        int x=0, y=0;
        for(int i=0;i<dir.length();i++){
            if(dir.charAt(i)=='N'){
                x++;
            } else if (dir.charAt(i)=='S') {
                x--;
            } else if (dir.charAt(i)=='E') {
                y++;
            } else if (dir.charAt(i)=='W') {
                y--;
            }
        }
        return Math.sqrt((x*x)+(y*y));
    }
}
