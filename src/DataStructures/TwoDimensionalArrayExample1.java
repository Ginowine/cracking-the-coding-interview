package DataStructures;

public class TwoDimensionalArrayExample1 {
    public static void main(String[] args){
        int[][] numbers = {{1,2}, {3, 4}};
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
