package DataStructures;

import java.util.Arrays;

public class SortMatrixDiagonally {

    public static void main(String[] args){

        int[][] array = {{3,3,1,1}, {2,2,1,2}, {1,1,1,2}};
        int[][] result = diagonalSort(array);

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        //System.out.println(Arrays.deepToString(result) + " ");
    }

    public static int[][] diagonalSort(int[][] M){
        int y = M.length;
        int x = M[0].length - 1;
        int[] diagonal = new int[y];

        for (int i = 2 - y; i < x; i++) {
            int k = 0;
            for (int j = 0; j < y; j++)
                if (i+j >= 0 && i+j <= x)
                    diagonal[k++] = M[j][i+j];
            Arrays.sort(diagonal, 0, k);
            k = 0;
            for (int j = 0; j < y; j++)
                if (i+j >= 0 && i+j <= x)
                    M[j][i+j] = diagonal[k++];
        }
        return M;
    }
}
