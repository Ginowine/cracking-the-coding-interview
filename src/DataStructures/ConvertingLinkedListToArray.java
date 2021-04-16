package DataStructures;

import java.util.LinkedList;
import java.util.List;

public class ConvertingLinkedListToArray {
    public static void main(String[] args) {
        List<String> l = new LinkedList<String>();
        l.add("John");
        l.add("Sara");
        l.add("Susan");
        l.add("Betty");
        l.add("Nathan");
        String[] str = l.toArray(new String[0]);
        System.out.println("The String Array elements are: ");
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
