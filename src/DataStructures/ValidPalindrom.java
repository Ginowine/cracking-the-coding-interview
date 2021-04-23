package DataStructures;

public class ValidPalindrom {

    public static void main(String[] args){
        String input = "A man, a plan, a canal: Panama";

        boolean result = isPalindrome(input);
        System.out.print(result);
    }

    public static boolean isPalindrome(String s){
        int start = 0;
        int end = s.length() - 1;
        while (start < end){
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }
            while (start < end && !Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }
            if (start < end && Character.toLowerCase(s.charAt(start++)) != Character.toLowerCase(s.charAt(end--))){
                return false;
            }
        }
        return true;
    }
}
