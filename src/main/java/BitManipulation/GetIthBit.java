package BitManipulation;

public class GetIthBit {
    public static int getIThBit(int x, int i){
        int bitMask = 1 << i;
        if((x & bitMask) == 0) return 0;
        else return 1;
    }

    public static void main(String[] args) {
        System.out.println(getIThBit(15, 4));
    }
}
