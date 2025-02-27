package Recursion;

public class CheckPalindrome {

    public static boolean isPalindrome(String str){
        if(str.length()<=1) return true;
        if(!str.startsWith(str.charAt(str.length()-1)+"")) return false;
        return isPalindrome(str.substring(1,str.length()-1));
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("malayalam"));
    }

}
