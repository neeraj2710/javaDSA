package Recursion;

import java.util.ArrayList;
import java.util.List;

public class FindElementIndex {

    public static List<Integer> searchIndexes(int[] arr,int x, int index){
        if(index == arr.length) return new ArrayList<>();
        List<Integer> res = searchIndexes(arr, x, index+1);
        if(arr[index] == x) res.add(0,index);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(searchIndexes(new int[]{9,8,10,8,8}, 8, 0));;
    }

}
