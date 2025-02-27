package BitManipulation;

public class SetIthBit {

    public static int setIthBit(int x, int i){
        int bitMask = 1<<i;
        return x | bitMask;
    }

    public static void main(String[] args) {
        System.out.println(setIthBit(10, 2));
    }

}
