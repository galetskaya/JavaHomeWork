//Пусть дан произвольный список целых чисел. Удалить из него чётные числа.

import java.util.ArrayList;
import java.util.Iterator;

public class Task3_02 {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(5);
        arr.add(18);
        arr.add(3);
        arr.add(1);
        arr.add(8);
        arr.add(2);
        arr.add(2);

        System.out.println("Original List: ");
        System.out.println(arr);

        //Variant 1 via Iterator
        Iterator<Integer> col = arr.iterator();
        while (col.hasNext()) {
            int y = (Integer)col.next();
            if(y % 2 == 0) col.remove();
        }
        System.out.println("New List: ");
        System.out.println(arr);

        //Variant 2 via removeIf
        arr.removeIf(i -> i % 2 == 0);
        System.out.println("New List: ");
        System.out.println(arr);
    }
}
