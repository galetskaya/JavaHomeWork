//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди,
//dequeue() - возвращает первый элемент из очереди и удаляет его,
//first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class Task05_2 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(5);
        ll.add(7);
        ll.add(87);
        ll.add(7);
        ll.add(4);

        System.out.printf("The Linked List enqueue result is %s\n ", enqueue(ll, 3));
        System.out.printf("The Linked List dequeue result is %s\n ", dequeue(ll));
        System.out.printf("The Linked List first element after dequeue is %s\n ", first(ll));
    }

    private static LinkedList<Integer> enqueue(LinkedList<Integer> list, int i) {
        list.addLast(list.remove(i));
        return list;
    }

    private static Integer dequeue(LinkedList<Integer> list) {
        return list.pollFirst();
    }

    private static int first(LinkedList<Integer> list) {
        return (int) list.getFirst();
    }
}