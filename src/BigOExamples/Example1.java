package BigOExamples;

//What is the runtime of the below code?

//This will take 0 (N) time. The fact that we iterate through the array twice doesn't matter.
public class Example1 {
    public static void foo(int[] array){
        int sum = 0;
        int product = 1;

        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }

        for (int i = 0; i < array.length; i++){
            product *= array[i];
        }

        System.out.println(sum + ", " + product);
    }

    public static void main(String[] args){
        int[] numbers = {2, 5, 4, 3, 7, 5, 9};
        foo(numbers);
    }
}
