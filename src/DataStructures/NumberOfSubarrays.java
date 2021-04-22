package DataStructures;

public class NumberOfSubarrays {
    static int countSubArray(int[] arr, int n, int k){
        int start = 0, end = 0;
        int count = 0, sum = arr[0];
        while (start < n && end < n){
            if (sum < k){
                end++;

                if (end >= start)
                    count += end - start;

                if (end < n)
                    sum += arr[end];
            }else {
                sum -= arr[start];
                start++;
            }
        }
        return count;
    }

    // Driver Code
    public static void main(String[] args)
    {
        int array[] = { 1, 11, 2, 3, 15 };
        int k = 10;
        int size = array.length;
        int count = countSubArray(array, size, k);
        System.out.println(count);
    }
}
