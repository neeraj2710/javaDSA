package Strings;

public class LargestString {
    public static String longestString(String[] arr) {
        // code here
        String largest = arr[0];

        for(String str : arr){
            if(largest.compareToIgnoreCase(str) < 0)
                largest = str;
        }

        return largest;
    }
}
