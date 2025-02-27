package Recursion;

public class PowerOf {

    public static int pow(int a, int b){
        if(a==0) return 0;
        if(b==0) return 1;
        return a*pow(a,b-1);
    }

    public static int opPow(int a, int b){
        if(a==0) return 0;
        if(b==0) return 1;
        if(b%2==0) return opPow(a*a, b/2);
        return a*opPow(a*a, (b-1)/2);
    }

    public static void main(String[] args) {
        System.out.println(pow(2, 5));
        System.out.println(opPow(2, 6));
    }

}
