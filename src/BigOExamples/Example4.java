package BigOExamples;

public class Example4 {
    static void printUnOrderedPairs(int[] arrayA, int[] arrayB){
        for (int i = 0; i < arrayA.length; i++){
            for (int j = 0; j < arrayB.length; j++){
                if (arrayA[i] < arrayB[j]){
                    System.out.println(arrayA[i] + "," + arrayB[j]);
                }
            }
        }
    }

    public static void main(String[] args){
        int[] numbers = {4, 5, 4, 3, 7, 5, 9};
        int[] numbers1 = {3, 6, 7, 8, 9, 10};
        printUnOrderedPairs(numbers, numbers1);
    }
}
