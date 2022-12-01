//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Task3_03 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(5);
        arr.add(18);
        arr.add(3);
        arr.add(1);
        arr.add(8);
        arr.add(2);
        arr.add(-2);

        System.out.println("Original List: ");
        System.out.println(arr);

        //Variant 1 via Iterator and function
        findMinMaxAverage(arr);

        //Variant 2 via Collections
        findMinMaxAverageCollections(arr);

    }
        public static void findMinMaxAverage(ArrayList<Integer> list) {
            Iterator<Integer> col = list.iterator();
            int min = list.get(0);
            int max = list.get(0);
            double res = 0;

            while (col.hasNext()) {
                int i = (Integer)col.next();
                if (i < min) min = i;
                if (i > max) max = i;
                res = res + i;
            }
            System.out.println("Variant 1");
            System.out.printf("Min value is: %s\n", min);
            System.out.printf("Max value is: %s\n", max);
            System.out.printf("Average value is: %.2f\n", res / list.size());
        }

        private static void findMinMaxAverageCollections (ArrayList<Integer> list) {
            System.out.println("Variant 2");
            System.out.printf("The minimum value is: %s\n", Collections.min(list));
            System.out.printf("The maximum value is: %s\n", Collections.max(list));
            Double average = list.stream().mapToInt(val -> val).average().orElse(0.0);
            System.out.printf("The average value is: %f\n", average);
        }
}


