package TwoDArrays;

public class DiagonalSum {
    public static int sum(int[][] mat) {
        // int sum = 0;
        // for(int i = 0 ; i < mat.length ; i++){
        //     for(int j = 0 ; j < mat[0].length ; j++){
        //         if(i == j || j == mat.length-1-i)
        //         sum += mat[i][j];
        //     }
        // }

        int sum = 0;
        for(int i = 0 ; i < mat.length ; i++){
            sum += mat[i][i];

            if(i != mat.length-i-1)
                sum += mat[i][mat.length-1-i];
        }
        return sum;
    }
}
