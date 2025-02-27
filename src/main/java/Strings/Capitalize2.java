package Strings;

public class Capitalize2 {

//  LC : 2129
    public static String transform(String str){
        String[] newStr = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for(String x : newStr){
            String s = x.toLowerCase();
            if(s.length()>=3){
                sb.append(Character.toUpperCase(s.charAt(0)));
                sb.append(s.substring(1));
                sb.append(" ");
            }else{
                sb.append(s);
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(transform("ThIs, is a caPitAl lEtTer"));
    }
}
