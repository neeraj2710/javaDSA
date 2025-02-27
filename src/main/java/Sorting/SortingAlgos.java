package Sorting;

public class SortingAlgos {

/*
best case: O(n)
worst case: O(n^2)
 */
    public static int[] bubbleSort(int[] arr) {
        for(int i = 0;i<arr.length-1;i++){
            int swaps = 0;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swaps++;
                }
            }
            if(swaps==0)
                break;
        }
        return arr;
    }

    /*
    O(n^2)
     */
    public static int[] selectionSort(int[] arr) {
        for(int i=0; i<arr.length-1;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    /*
    O(n^2)
     */
    public static int[] insertionSort(int[] arr) {
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prv = i-1;
            while(prv>=0 && arr[prv]>curr){
                arr[prv+1] = arr[prv];
                prv--;
            }
            arr[prv+1] = curr;
        }
        return arr;
    }

    /*
    O(nlogn)
     */
    public static int[] countingSort(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        int [] count = new int[max+1];

        for (int k : arr) {
            count[k]++;
        }

        int j=0;
        for(int i =0;i<count.length;i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        return arr;
    }

}
