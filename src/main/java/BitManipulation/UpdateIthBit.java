package BitManipulation;

public class UpdateIthBit {

    public static int updateIthBit(int n, int newBit, int i){
        n = ClearIthBit.clearIthBit(n, i);
        return n | newBit<<i;
    }

    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 0, 1));
    }

}
