package DataStructures;

public class ValidAnagram {
    public static void main(String[] args){
        String input1 = "anagram";
        String input2 = "nagaram";

        boolean result = isAnagram(input1, input2);
        System.out.println(result);
    }

    public static boolean isAnagram(String s, String t){
        if (s.length() != t.length()){
            return false;
        }
        int[] counts = new int[26];

        for (int i = 0; i < s.length(); i++){
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }
        for (int i : counts){
            if (i != 0){
                return false;
            }
        }
        return true;
    }
}
