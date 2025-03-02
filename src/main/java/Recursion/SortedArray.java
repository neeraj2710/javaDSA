package Recursion;

public class SortedArray {

    public static boolean isSorted(int[] arr,int i){
        if(i == arr.length-1) return true;
        if(arr[i]<=arr[i+1]) return isSorted(arr, i+1);
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isSorted(new int[]{10,15,20,22,32,43},0));
    }

}
