package BitManipulation;

public class ModExp {
    public static int fastExp(int a, int b, int M){
        int ans = 1;
        a %= M;
        while(b > 0){
            if((b&1) != 0) ans = ans * a % M;
            a = a*a%M;
            b = b>>1;
        }
        return ans;
    }

    public static int superPow(int a, int[] b) {
        int m = 1140;
        int e = 0;
        for(int i=0;i<b.length;i++){
            e = (e*10 + b[i]) % m;
        }
        if(e == 0) e = m;
        return fastExp(a,e,1337);
    }

    public static void main(String[] args) {
        System.out.println(superPow(2, new int[]{1,0}));
    }
}
