package Recursion;

public class CountZeros {

    public static int countZeros(int n){
        int x=0;
        if(n==0) return 1;
        if(n < 9) return 0;
        if(n%10 == 0) x=1;
        return x+countZeros(n/10);
    }

    public static void main(String[] args) {
        System.out.println(countZeros(1080));
    }

}
