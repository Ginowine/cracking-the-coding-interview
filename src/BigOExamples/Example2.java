package BigOExamples;

//What is the runtime of the below code?

//The inner for loop has 0 (N) iterations and it is called N times. Therefore, the runtime is 0 (N2 ) .
public class Example2 {

    static void printPairs(int[] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                System.out.println(array[i] + ", " + array[j]);
            }
        }
    }
    public static void main(String[] args){
        int[] numbers = {2, 5};
        printPairs(numbers);
    }
}
