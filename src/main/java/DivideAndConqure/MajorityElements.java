package DivideAndConqure;

public class MajorityElements {

    public static int countInRange(int[] arr,int lo,int hi,int target){
        int count = 0;
        for(int i=lo;i<=hi;i++){
            if(arr[i] == target) count++;
        }
        return count;
    }

    public static int majorityElements(int[] arr,int lo,int hi){
        // base case
        if(hi == lo) return arr[lo];

        int mid = lo+(hi-lo)/2;

        int left = majorityElements(arr, lo, mid);
        int right = majorityElements(arr, mid+1, hi);

        if(left == right) return left;

        int countLeft = countInRange(arr,lo,hi,left);
        int countRight = countInRange(arr,lo,hi,right);

        return countLeft>countRight ? left : right;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElements(arr, 0, arr.length-1));
    }

}
