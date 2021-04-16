package RecursiveFunctions;

public class Example {
    public static void main(String[] args){
        int result = recursiveFunction(5);
        System.out.println(result);
    }

    static int recursiveFunction(int n){
        if (n <= 1){
            return 1;
        }

        return recursiveFunction(n - 1) + recursiveFunction(n - 1);
    }
}
