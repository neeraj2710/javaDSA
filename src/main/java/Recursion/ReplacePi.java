package Recursion;

public class ReplacePi {

    public static String replacePi(String str){
        if(str.length() < 2) return str;
        if(str.startsWith("pi")) return "3.14"+replacePi(str.substring(2));
        return str.charAt(0)+replacePi(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(replacePi("xpix"));
    }

}
