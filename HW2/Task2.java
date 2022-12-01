//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите
// в лог-файл.

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

public class Task2 {
    public static void main(String[] args) throws IOException {
        int[] array = {6, 4, 5, 3, 41, 9, 7, 54};

        Logger logger = Logger.getLogger(Task2.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.addHandler(fh);


        boolean isSorted = false;
        int temp;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
                logger.info(Arrays.toString(array));
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
