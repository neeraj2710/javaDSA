package TwoDArrays;

public class SpiralMatrix {
    public static int[] spiral(int[][] matrix){
        int [] res = new int[matrix.length*matrix[0].length];

        int startRow = 0;
        int endRow= matrix.length-1;

        int startCol = 0;
        int endCol = matrix[0].length-1;

        int idx = 0;

        while(startRow <= endRow && startCol <= endCol){
            for(int j = startCol ; j<= endCol ; j++){
                res[idx] = matrix[startRow][j];
                idx++;
            }

            for(int i = startRow + 1 ; i <= endRow ; i++){
                res[idx] = matrix[i][endCol];
                idx++;
            }

            for(int j = endCol - 1 ; j >= startCol ; j--){
                if(startRow == endRow){
                    return res;
                }
                res[idx] = matrix[endRow][j];
                idx++;
            }

            for(int i = endRow-1 ; i>=startRow + 1 ; i--){
                if(startCol == endCol){
                    return res;
                }
                res[idx] = matrix[i][startCol];
                idx++;
            }

            startRow++;
            startCol++;

            endRow--;
            endCol--;
        }

        return res;
    }
}
