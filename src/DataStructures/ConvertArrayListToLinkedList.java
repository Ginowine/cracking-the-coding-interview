package DataStructures;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ConvertArrayListToLinkedList {
    public static void main(String args[]) {
        List<String> arrList = Arrays.asList("John", "Jacob", "Kevin", "Katie", "Nathan");
        System.out.println("ArrayList = " + arrList);
        List<String> myList = new LinkedList<>(arrList);
        System.out.println("LinkedList (ArrayList to LinkedList) = " + myList);
    }
}
