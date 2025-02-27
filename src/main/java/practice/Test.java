package practice;

import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) {
        try{
            System.out.println(5/0);
        }catch (ArithmeticException ex){
            ex.fillInStackTrace(); 
        }
    }
}
