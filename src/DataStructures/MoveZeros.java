package DataStructures;

public class MoveZeros {

    public static void moveZeros(int[] nums){
        int index = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                nums[index++] = nums[i];
            }
        }
        for (int i = index; i < nums.length; i++){
            nums[i] = 0;
        }
    }
    public static void main(String[] args){
        int[] numbers = {0,1,0,3,12};
        moveZeros(numbers);
        System.out.println("Array after pushing zeros to the back: ");

        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
