package Sem_1.HW_Task_2;

/**
 * Вывести все простые числа от 1 до 1000
 */
public class Program {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            int count = 0;
            for (int value = 1; value < 1000; value++) {
                if (i % value == 0){
                    count +=1;
                }
            }
            if (count < 3) {
                System.out.print("  " + i + ",");
            }
        }
    }
}
