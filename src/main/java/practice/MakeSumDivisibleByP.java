package practice;

public class MakeSumDivisibleByP {
    public static int minSubarray(int[] nums, int p){
        int len = Integer.MAX_VALUE;
        long sum1 = 0;
        for(int x: nums){
            sum1 += x;
        }
        if(sum1%p == 0){
            return 0;
        }
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                long sum=0;
                for(int k=0;k<i;k++){
                    sum+=nums[k];
                }
                for(int k=j+1;k<nums.length;k++){
                    sum+=nums[k];
                }
                if(sum%p==0){
                    len = Math.min(len, j-i+1);
                }
            }
        }
        if(len == nums.length){
            return -1;
        }
        return len==Integer.MAX_VALUE?-1:len;
    }

    public static void main(String[] args) {
        System.out.println(minSubarray(new int[]{3,1,4,2}, 6));
        System.out.println(minSubarray(new int[]{6,3,5,2}, 9));
    }
}
