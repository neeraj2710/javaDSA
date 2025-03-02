package Recursion;

public class TilingProblem {

    /*
    Given a "2Xn" board and tiles of size "2X1", count the number of ways to tile the given board
    using 2X1 tiles.(A tile can be placed either horizontally or vertically)
     */


    public static int noOfWays(int n){
        if(n==1 || n==0) return 1;
        return noOfWays(n-1)+noOfWays(n-2);
    }

    public static void main(String[] args) {
        System.out.println(noOfWays(4));
    }

}
