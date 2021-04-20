package BigOExamples;

public class ReversingArrays {
    static void reverseArray(int[] array){
        for (int i = 0; i < array.length/2; i++){
            int other = array.length - i - 1;
            int temp = array[i];
            array[i] = array[other];
            array[other] = temp;

            System.out.println(array[other]);
        }
    }

    public static void main(String[] args){
        int[] numbers = {2, 3, 4, 5};
        reverseArray(numbers);
    }
}
