package Recursion;

public class PairStar {

    public static String pairStar(String str){
        if(str.length() <= 1) return str;
        if(str.charAt(0) == str.charAt(1)) return str.charAt(0)+"*"+pairStar(str.substring(1));
        return str.charAt(0)+pairStar(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(pairStar("hello"));
        System.out.println(pairStar("aaaa"));
    }

}
