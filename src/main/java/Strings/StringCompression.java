package Strings;

public class StringCompression {
    static String checkCompressed(String S) {
        // code here
        String s = "";
        for(int i = 0;i<S.length();i++){
            Integer count = 1;
            while(i<S.length()-1 && S.charAt(i)==S.charAt(i+1)){
                count++;
                i++;
            }
            s+=S.charAt(i);
            if(count>1){
                s+= count.toString();
            }
        }

        return s;
    }

    public static void main(String[] args) {
        System.out.println(checkCompressed("GEEKSFORGEEKS"));
    }
}
