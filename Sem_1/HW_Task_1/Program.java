package Sem_1.HW_Task_1;

import java.util.Scanner;

/**
 * Вычислить n-ое треугольного число (сумма чисел от 1 до n)
 * n! (произведение чисел от 1 до n)
 */
public class Program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int num = iScanner.nextInt();
        iScanner.close();
        double num_sum = 0.5 * num * (num + 1);
        int y = (int) num_sum;
        int x = 1;
        int fact = 1;
        while (x <= num) {
            fact *= x;
            x += 1;
        }
        System.out.printf("При n = %d: Треугольное число = %d,  факториал n = %d. \n", num, y, fact);    
    }
}
