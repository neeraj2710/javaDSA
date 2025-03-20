package DivideAndConqure;

public class QuickSort {

    public static void quickSort(int[] arr, int si, int se){
        if(si>=se){
            return;
        }
        // last element = pivot
        int pidx = partition(arr,si,se);
        quickSort(arr, si, pidx-1);// sorting left side
        quickSort(arr, pidx+1, se);//sorting right side
    }

    public static int partition (int[] arr, int si, int se){
        int pivot = arr[se];
        int i = si-1;// iterator for making spaces for smaller elements

        for(int j = si;j<=se;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        arr[se] = arr[i];
        arr[i] = pivot;
        return i;
    }


    public static void main(String[] args) {
        int[] arr = {6,3,9,8,2,5,-5};
        quickSort(arr,0,arr.length-1);
        for(int x:arr){
            System.out.println(x);
        }
    }

}
