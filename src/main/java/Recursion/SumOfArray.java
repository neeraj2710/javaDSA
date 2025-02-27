package Recursion;

public class SumOfArray {

    public static int sumOfArray(int [] arr,int a){
        if(a==arr.length-1) return arr[a];
        return arr[a] + sumOfArray(arr,a+1);
    }

    public static void main(String[] args) {
        System.out.println(sumOfArray(new int[]{1,2,3,4,5},0));
    }

}
