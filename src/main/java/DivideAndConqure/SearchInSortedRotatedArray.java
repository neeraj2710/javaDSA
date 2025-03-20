package DivideAndConqure;

public class SearchInSortedRotatedArray {

    public static int search(int[] arr, int target,int si,int se){
        //base case
        if(si>se) return -1;
        int mid = si+(se-si)/2;
        if(arr[mid] == target) return mid;

        //l1
        if(arr[si]<=arr[mid]){
            //left of l1
            if(arr[si]<=target && target<=arr[mid]){
                return search(arr, target, si, mid-1);
            }
            //right of mid
            else {
                return search(arr, target, mid+1, se);
            }
        }
        //l2
        else{
            //right of l2
            if(arr[mid]<=target && target<=arr[se]){
                return search(arr, target, mid+1, se);
            }
            //left of mid
            else{
                return search(arr, target, si, mid-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(search(arr, 0, 0, arr.length-1));
    }

}
