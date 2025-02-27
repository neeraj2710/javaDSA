package Recursion;

public class SumOfPositiveNumber {
    public static int sumOfPositiveNumbers(int n){
        if(n<=1) return n;
        return n+sumOfPositiveNumbers(n-1);
    }

    public static void main(String[] args) {
        System.out.println(sumOfPositiveNumbers(5));
    }
}
