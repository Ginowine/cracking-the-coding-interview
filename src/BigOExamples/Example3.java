package BigOExamples;
//This is very similar code to the above example, but now the inner for loop starts at i + 1.


public class Example3 {

    static void printPairs(int[] array){
        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                System.out.println(array[i] + ", " + array[j]);
            }
        }
    }
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        printPairs(numbers);
    }
}
