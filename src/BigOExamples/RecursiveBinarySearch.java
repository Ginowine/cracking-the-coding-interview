package BigOExamples;

// This is recursive binary search algorithm
// it is Big O(log n)
public class RecursiveBinarySearch {
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int start = 0;
        int end = numbers.length - 1;

        int result = binarySearch(numbers, 8, start, end);
        System.out.println(result);
    }
    public static int binarySearch(int[] input, int target, int start, int end){
        if (start >= end){
            return  -1;
        }else {
            int mid = start + (end - start)/2;
            if (target < input[mid]){
                return binarySearch(input, target, start, mid-1);
            }else if (target > input[mid]){
                return binarySearch(input, target, mid+1, end);
            }else {
                return mid;
            }
        }
    }
}
