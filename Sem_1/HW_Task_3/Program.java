package Sem_1.HW_Task_3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int first_num = iScanner.nextInt();
        System.out.print("Введите знак операции: ");
        String operaton = iScanner.next();
        char oper = operaton.charAt(0);
        System.out.print("Введите второе число: ");
        int second_num = iScanner.nextInt();
        iScanner.close();
        int result = 0;
        System.out.print("Результат вычисления: ");
        switch (oper) {
            case '+':
                result = first_num + second_num;
                System.out.println(result);
                break;
            case '-':
                result = first_num - second_num;
                System.out.println(result);
                break;
            case '*':
                result = first_num * second_num;
                System.out.println(result);
                break;
            case '/':
                result = first_num / second_num;
                System.out.println(result);
                break;
            default:
                System.out.println("Задана неверная операция, повторите снова");
                break;
        }
    }

}
