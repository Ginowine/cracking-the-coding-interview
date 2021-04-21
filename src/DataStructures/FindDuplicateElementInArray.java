package DataStructures;

public class FindDuplicateElementInArray {
    public static void main(String[] args){
        int[] numbers = {3, 4, 2};
        boolean result = containsDuplicate(numbers);

        System.out.println(result);
    }

    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; ++i) {
            for (int j = 0; j < i; ++j) {
                if (nums[j] == nums[i]) return true;
            }
        }
        return false;
    }
}
