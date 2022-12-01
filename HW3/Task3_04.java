//4*. (Необязательная задача повышенной сложности)
//Даны два ArrayList из целых чисел. Написать функции, которые вычисляют разницу коллекций:
//Разность:
//A - B = все числа из первой коллекции, которые не содержатся во второй коллекции
//B - A = все числа из второй коллекции, которые не содержатся в первой
//Симметрическая разность:
//A ^ B = числа из первой коллекции, которых нет во второй, А ТАКЖЕ числа из второй, которых нет в первой

import java.util.ArrayList;
import java.util.Random;

public class Task3_04 {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = createListRandom(5);
        ArrayList<Integer> list2 = createListRandom(5);

        System.out.printf("First list %s\n", list1);
        System.out.printf("Second list %s\n", list2);

        System.out.printf("A - B %s\n", diffAB(list1,list2));
        System.out.printf("B - A %s\n", diffAB(list2,list1));

        System.out.printf("Symmetrical Difference A - B merged %s\n", symmetricDiff(diffAB(list1,list2),
                diffAB(list2,list1)));
    }
    private static ArrayList<Integer> createListRandom (int size) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 0; j < size; j++) {
            list.add(rand.nextInt(10));
        }
        return list;
    }

    private static ArrayList<Integer> diffAB (ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> resultList = new ArrayList<>();
        int count = 0;
        for (int i : list1) {
            for (int j : list2) {
                if (i == j)
                    count++;
            }
            if (count == 0) {
                resultList.add(i);
            }
            count = 0;
        }
        return resultList;
    }

    private static ArrayList<Integer> symmetricDiff (ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for(int i: list2) {
            list1.add(i);
        }
        return list1;
    }
}


