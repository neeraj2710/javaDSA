package BitManipulation;

public class EvenOdd {

    static String evenOdd(int a){
        int bitMask = 1; // bit mask is no. using which operation is performed
        if((a&1) == bitMask) return "odd"; // condition for odd no.
        else return "even";
    }

    public static void main(String[] args) {
        System.out.println(evenOdd(19));
        System.out.println(evenOdd(6));
    }
}
