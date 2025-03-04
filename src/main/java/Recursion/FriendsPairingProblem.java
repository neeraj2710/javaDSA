package Recursion;

public class FriendsPairingProblem {
    /*
    Given n friends, each one can remain single or can be paired up with some other
    friend. Each friend can be paired only once. Find out the total number of ways in
    which friends can remain single or can be paired up.
     */
    public static int waysToPair(int n){
        if(n == 1 || n == 2) return n;
        return waysToPair(n-1)+((n-1)*waysToPair(n-2));
    }

    public static void main(String[] args) {
        System.out.println(waysToPair(4));
    }

}
