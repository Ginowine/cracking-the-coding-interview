package BigOExamples;

public class CopyArrays {
    public static void main(String[] args){

        int[] oldArray = {1,3,5,7};
        int[] newArray = new int[oldArray.length];

        for (int i = 0; i < oldArray.length; i++){
            newArray[i] = oldArray[i];
        }
        //newArray[0]++;

        for (int i = 0; i < oldArray.length; i++){
            System.out.print(oldArray[i] + " ");
        }
        System.out.print("\n");

        for (int i = 0; i < newArray.length; i++){
            System.out.print(newArray[i] + " ");
        }
    }
}
