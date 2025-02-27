package BitManipulation;

public class Test {
    public static void main(String[] args) {
        System.out.println(5&6); // AND o/p 101 & 110 = 100
        System.out.println(5|6); // OR o/p 101 | 110  = 111
        System.out.println(5^6); // XOR o/p 101 ^ 110 = 011
        System.out.println(~5); // 1s Comp ~101 = 010 but in pc it is -6 cos of extra zeros at beginning
        System.out.println(5<<2); // left shift 5<<2 = 5 * 2^2 = 20
        System.out.println(6>>1); // right shift 6>>1 = 6/2^1 = 3
    }
}
