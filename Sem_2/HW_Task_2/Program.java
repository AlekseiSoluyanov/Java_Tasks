package Sem_2.HW_Task_2;

import java.util.Arrays;
import java.util.logging.Logger;

/**
 * Реализуйте алгоритм сортировки пузырьком числового массива,
 * результат после каждой итерации запишите в лог-файл.
 */
public class Program {
    public static Logger logger = Logger.getLogger(Program.class.getName());

    public static void main(String[] args) {
        int[] arraySort = { 3, 7, 2, 6, 1, 8, 4, 2, 6 };
        logger.info("Исходный массив: " + Arrays.toString(arraySort));
        bubbleSort(arraySort);
        logger.info("Отсортированный массив: " + Arrays.toString(arraySort));
    }

    public static void bubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            logger.info("Промежуточный результат на " + (i + 1) + "-й итерации: " + Arrays.toString(array));
        }
    }
}