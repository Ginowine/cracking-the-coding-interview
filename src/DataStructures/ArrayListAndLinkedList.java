package DataStructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListAndLinkedList {
    public static void main(String[] args){

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        List<String> list1 = new LinkedList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");

//        System.out.println(list);
//        System.out.println(list1);

        for (String s : list) {
            System.out.print(s + " ");
        }

        System.out.println(" ");

        for (String s : list1) {
            System.out.print(s + " ");
        }
    }
}
