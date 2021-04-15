package BigOExamples;

public class Example0 {
    public static void main(String[] args){
        int value = 10;
        int result = add(value);

        System.out.println(result);
    }
    static int add(int n){
        if (n <= 0){
            return 0;
        }
        return n + add(n - 1);
    }
}
