package DataStructures;

public class MaximumSubArray {
    public static void main(String[] args){
        int[] numbers = {2,3,-2,4};
        int result = maxProduct(numbers);
        System.out.println(result);
    }

//    public static int subArray(int[] input){
//        int sum = 0;
//        int a = 0;
//        for (int i = 0; i < input.length; i++){
//            a += input[i];
//            if (sum < a){
//                sum = a;
//            }
//            if (a < 0){
//                a = 0;
//            }
//        }
//
//        return sum;
//    }
//
//    public int maxProduct(int[] nums) {
//        int res = Integer.MIN_VALUE;
//        for (int num : nums) {
//            if (num > res) {
//                res = num;
//            }
//        }
//
//        int curMax = 1;
//        int curMin = 1;
//        for (int num : nums) {
//            if (num == 0) {
//                curMax = 1;
//                curMin = 1;
//                continue;
//            }
//            int tmp = curMax;
//            curMax = Math.max(Math.max(curMax * num, curMin * num), num);
//            curMin = Math.min(Math.min(tmp * num, curMin * num), num);
//            res = Math.max(res, curMax);
//        }
//        return res;


    static int maxProduct( int[] nums ) {
        // Input Data Validations
        if ( nums.length == 1 ) return nums[0];

        // Products from left to right, using a helper array of continuous products
        int[] left = new int[nums.length];
        left[0] = nums[0];

        for ( int i = 1; i < nums.length; i++ )
            if ( left[i - 1] == 0 )                   // start new product chain after every zero
                left[i] = nums[i];
            else
                left[i] = left[i - 1] * nums[i];        // continue this product chain


        // Products from right to left, using 2nd helper array of continuous products
        int[] right = new int[nums.length];
        right[nums.length - 1] = nums[nums.length - 1];

        for ( int i = nums.length - 2; i >= 0; i-- )
            if ( right[i + 1] == 0 )                  // start new product chain after every zero
                right[i] = nums[i];
            else
                right[i] = right[i + 1] * nums[i];      // continue this product chain


        // Find the biggest product in both arrays (from left and from right)
        int max = Integer.MIN_VALUE;
        for ( int number : left )
            max = Math.max( max, number );

        for ( int number : right )
            max = Math.max( max, number );


        // Return the biggest product of continuous numbers in the given array
        return max;
    }
}
