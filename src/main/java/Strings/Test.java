package Strings;

public class Test {
    public static void main(String[] args) {
        System.out.println(findKey(3521,2452,1352));
    }
    public static int findKey(int input1, int input2, int input3) {
        int min1,min2,min3,max1,max2,max3;
        int x=input1;
        min1 = Integer.MAX_VALUE;
        while(x>0){
            if(x%10 < min1){
                min1=x%10;
            }
            x=x/10;
        }
        x=input2;
        min2 = Integer.MAX_VALUE;
        while(x>0){
            if(x%10 < min2){
                min2=x%10;
            }
            x=x/10;
        }
        x=input3;
        min3 = Integer.MAX_VALUE;
        while(x>0){
            if(x%10 < min3){
                min3=x%10;
            }
            x=x/10;
        }
        x=input1;
        max1 = Integer.MIN_VALUE;
        while(x>0){
            if(x%10 > max1){
                max1=x%10;
            }
            x=x/10;
        }
        x=input2;
        max2 = Integer.MIN_VALUE;
        while(x>0){
            if(x%10 > max2){
                max2=x%10;
            }
            x=x/10;
        }
        x=input3;
        max3 = Integer.MIN_VALUE;
        while(x>0){
            if(x%10 > max3){
                max3=x%10;
            }
            x=x/10;
        }
        System.out.println(min1+" "+min2+" "+min3+" "+max1+" "+max2+" "+max3);
        return (min1+min2+min3)-(max1+max2+max3);
    }
}
