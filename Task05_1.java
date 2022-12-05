//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;

public class Task05_1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(15);
        ll.add(8);
        ll.add(6);
        ll.add(4);

        System.out.println("The reversed Linked list is: ");
        System.out.println(reverseLinkedList(ll));
    }
    private static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
        LinkedList<Integer> newList = new LinkedList<>();
        for(int i = list.size()-1; i >= 0; i--) {
            newList.add(list.get(i));
        }
        return newList;
    }
}
