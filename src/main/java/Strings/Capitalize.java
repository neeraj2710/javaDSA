package Strings;

public class Capitalize {
    public String transform(String s)
    {
        // code here
        StringBuffer sb = new StringBuffer();
        sb.append(Character.toUpperCase(s.charAt(0)));

        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==' ' && i<s.length()-1){
                i++;
                sb.append(" ");
                sb.append(Character.toUpperCase(s.charAt(i)));
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();

    }
}
