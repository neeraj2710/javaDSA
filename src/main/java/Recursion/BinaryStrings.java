package Recursion;

public class BinaryStrings {

    public static void nBinaryStrings(int n,int lastPlace, String str){
        if(n == 0) {
            System.out.println(str);
            return;
        }
        if(lastPlace == 0) {
            nBinaryStrings(n-1, 0, str+"0");
            nBinaryStrings(n-1, 1, str+"1");
        }else {
            nBinaryStrings(n-1, 0, str+"0");
        }


    }

    public static void main(String[] args) {
        nBinaryStrings(3, 0, "");
    }

}
