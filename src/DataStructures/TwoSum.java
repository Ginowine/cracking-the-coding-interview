package DataStructures;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args){
        int[] numbers = {2,7,11,15};
        int target = 9;

        int[] result1 = findTwoSum(numbers, target);
        System.out.println(Arrays.toString(result1));
    }


    public static int[] findTwoSum(int[] input, int target){
        int[] result = new int[2];

        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < input.length; i++){
            int difference = target - input[i];
            if (hashMap.containsKey(difference)){
                result[0] = i;
                result[1] = hashMap.get(difference);
                return result;
            }
            hashMap.put(input[i], i);
        }
        return result;
    }
}
