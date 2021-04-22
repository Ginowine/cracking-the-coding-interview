package DataStructures;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args){
        String input = "{}";
        boolean result = isValid(input);
        System.out.println(result);
    }


    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<Character>();

        for (Character c : s.toCharArray()){
            if (c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }else if (c == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }else if (c == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }else if (c == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
