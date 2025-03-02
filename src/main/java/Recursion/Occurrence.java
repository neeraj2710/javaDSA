package Recursion;

public class Occurrence {

    public static int firstOccurrence(int[] arr,int key,int idx){
        if(idx == arr.length) return -1;
        if(arr[idx] == key) return idx+1;
        return firstOccurrence(arr,key, idx+1);
    }

    public static int lastOccurrence(int[] arr,int key,int idx){
        if(idx == arr.length) return -1;
        if(lastOccurrence(arr, key, idx+1)==-1 && arr[idx]==key) return idx+1;
        return lastOccurrence(arr, key, idx+1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3,4,3,5,4};
        System.out.println(firstOccurrence(arr, 6, 0));
        System.out.println(lastOccurrence(arr, 6, 0));
    }

}
