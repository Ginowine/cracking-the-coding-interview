package BigOExamples;

// this is a linear search algorithm
// the time complexity for this problem which is a linear search is O(n)
public class LinearSearchExample1 {
    public static void main(String[] args){
        int[] numbers = {1, 3, 6, 2, 7, 9, 5, 4};
        int result = doLinearSearch(numbers, 14);

        if (result > 0){
            System.out.println("target number found at index: " + result);
        }else {
            System.out.println("target number not found in the array: " + result);
        }

    }

    // this method loops through every elements in the array
    public static int doLinearSearch(int[] array, int target){
        if (array.length == 0){
            return -1;
        }
        // returns the position of target if found, else return none
        for (int index = 0; index < array.length; index++){
            if (array[index] == target){
                return index;
            }
        }
        return -1;
    }
}
