package Recursion;

public class Multiplication {

    public static int multiply(int a,int b){
        if(a==0 || b==0) return 0;
        return a + multiply(a, b-1);
    }

    public static void main(String[] args) {
        System.out.println(multiply(3, 5));
    }

}
