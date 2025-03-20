package DivideAndConqure;

public class StringsMergeSort {

    public static void mergeSort(String[] arr,int l,int r){
        if(l>=r) return;
        int mid = l+(r-l)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        mergeSortedArray(arr, l, r, mid);
    }

    public static void mergeSortedArray(String[] arr,int l,int r,int mid){
        String[] result = new String[r-l+1];
        int i = l;
        int j = mid+1;
        int k = 0;

        while(i<=mid && j<=r){
            if(arr[i].compareTo(arr[j])<0){
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
            result[k++]=arr[j++];
        }

        for(k=0,i=l;k<result.length;i++,k++) arr[i] = result[k];
    }

    public static void main(String[] args) {
        String[] arr = {"sun","earth","mars","mercury"};
        mergeSort(arr, 0, arr.length-1);
        for(String str : arr){
            System.out.println(str);
        }
    }

}
