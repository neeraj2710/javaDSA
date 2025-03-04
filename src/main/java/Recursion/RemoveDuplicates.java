package Recursion;

public class RemoveDuplicates {

    public static String removeDuplicates(String str,boolean[] arr){
        if(str.length() == 1){
            if(!arr[(int)str.charAt(0)-'a']) return str;
            else return "";
        }
        StringBuffer sb = new StringBuffer();
        if(!arr[(int)str.charAt(0)-'a']) {
            sb.append(str.charAt(0));
            arr[(int)str.charAt(0)-'a'] = true;
        }
        sb.append(removeDuplicates(str.substring(1), arr));
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("neeraj",new boolean[26]));
    }

}
