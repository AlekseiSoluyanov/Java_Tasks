package Sem_3.Home_Work_3;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
/**
 * Задан целочисленный список ArrayList. Найти минимальное,
 * максимальное и среднее из этого списка.
 */
public class Task_3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int index = 0; index < 10; index++) {
            int num = random.nextInt(1, 20);
            list.add(num);
        }
        System.out.println(list);

        list.sort(Comparator.naturalOrder());
        int MinValue = list.get(0);
        int MaxValue = list.get(list.size() - 1);
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        int ArithMean = sum / list.size();

        System.out.println("Минимальное значение: " + MinValue);
        System.out.println("Максимальное значение: " + MaxValue);
        System.out.println("Среднее арифметическое: " + ArithMean);
    }
}
