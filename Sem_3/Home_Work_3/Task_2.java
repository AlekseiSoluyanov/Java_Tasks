package Sem_3.Home_Work_3;

import java.util.ArrayList;
import java.util.Random;

/**
 * Пусть дан произвольный список целых чисел,
 * удалить из него чётные числа
 */
public class Task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(1, 20);
            list.add(num);
        }
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(list.get(i--));
            }
        }
        System.out.println(list);
    }

}
