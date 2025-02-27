package BitManipulation;

public class ClearIthBit {

    public static int clearIthBit(int x, int i){
        int bitMask = 1<<i;
        return x & (~bitMask);
    }

    public static void main(String[] args) {
        System.out.println(clearIthBit(10, 1));
    }

}
