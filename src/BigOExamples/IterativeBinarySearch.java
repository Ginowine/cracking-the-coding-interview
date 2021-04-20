package BigOExamples;

// This is a binary search algorithm
// The time complexity of binary search is Big O(log n)
public class IterativeBinarySearch {
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int result = binarySearch(numbers, 8);
        System.out.println(result);
    }

    // this method does a binary search on the numbers array
    public static Integer binarySearch(int[] numbers, int target){
        int first = 0;
        int last = numbers.length - 1;

        while (first <= last){
            int mid = (first + last) / 2;
            if (numbers[mid] == target){
                return mid;
            }else if (numbers[mid] < target){
                first = mid + 1;
            }else {
                last = mid - 1;
            }
        }

        return null;
    }
}
