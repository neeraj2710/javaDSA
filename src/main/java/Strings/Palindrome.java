package Strings;

public class Palindrome {
    public static boolean isPalindrome(String str) {
//        for(int i = 0,j=str.length()-1;i<=j;i++,j--){
//            if(str.charAt(i) != str.charAt(j)){
//                return false;
//            }
//        }
//        return true;

        for(int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
}
