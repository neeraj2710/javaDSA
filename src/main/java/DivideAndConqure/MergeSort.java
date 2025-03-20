package DivideAndConqure;

public class MergeSort {

    // time = O(nlogn)
    public static void mergeSort(int[] arr, int l, int r){
        if(l>=r) return;
        int mid = l+(r-l)/2;
        mergeSort(arr,0,mid);
        mergeSort(arr, mid+1, r);
        mergeSortedArray(arr,l,r,mid);
    }

    public static void mergeSortedArray(int[] arr, int l,int r,int mid){
        int[] result = new int[r-l+1]; // space = O(n)
        int i=l;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=r){
            if(arr[i]<arr[j]){
                result[k] = arr[i];
                i++;
            }else{
                result[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            result[k++] = arr[i++];
        }
        while(j<=r){
            result[k++] = arr[j++];
        }

        for(k=0,i=l;k< result.length;i++,k++) arr[i] = result[k];
    }

    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8,-2};
        mergeSort(arr, 0, arr.length-1);
        for (int x: arr){
            System.out.println(x);
        }
    }

}
