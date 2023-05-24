package Sem_4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;

/*
* Реализовать консольное приложение, которое:
* 1. Принимает от пользователя и “запоминает” строки.
* 2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
* 3. Если введено revert, удаляет предыдущую введенную строку из памяти.
* 4. Если введено exit, завершаем программу
 */
public class Home_Work {
    public static void main(String[] args) {
        Deque<String> list = new LinkedList<>(); // Deque - двусторонняя очередь
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                break;
            } else if (input.equals("print")) {
                System.out.println(list);
            } else if (input.equals("revert")) {
                try{
                    list.removeLast();
                } catch (NoSuchElementException e) {
                    System.err.println("Ошибка!");
                }
                
            } else {
                list.addFirst(input);
            }
        }
    }
}
