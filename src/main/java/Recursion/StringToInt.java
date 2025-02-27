package Recursion;

public class StringToInt {

    public static int stringToInt(String str){
        if(str.length() == 1) return str.charAt(0)-48;
        return (int) ((str.charAt(0)-48)*Math.pow(10, str.length()-1))+stringToInt(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(stringToInt("215"));
    }

}
