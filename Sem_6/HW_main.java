package Sem_6;
/*
* Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы.
Реализовать в Java.

Создать множество ноутбуков.

Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и
выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:

“Введите цифру, соответствующую необходимому критерию:

1 - ОЗУ
2 - Объём ЖД
3 - Операционная система
4 - Цвет …

Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры
фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HW_main {
    public static void main(String[] args) {
        ArrayList<laptop> listObject = new ArrayList<>();
        listObject.add(new laptop("black", "Win", 256, 16));
        listObject.add(new laptop("white", "Win", 1024, 64));
        listObject.add(new laptop("blue", "Win", 256, 8));
        listObject.add(new laptop("grey", "Mac", 256, 16));
        listObject.add(new laptop("grey", "Mac", 128, 8));

        seachVar(listObject, choseParametrs());
    }

    public static void seachVar(ArrayList<laptop> listObj, Map<String, String> parametrsForSeach) {
        ArrayList<laptop> result = new ArrayList<>();
        if (parametrsForSeach.isEmpty()) {
            System.out.println("Введите хотя бы один параметр поиска!\n");
            seachVar(listObj, choseParametrs());
        } else {
            var fields = parametrsForSeach.keySet();
            for (Object field : fields) {
                for (laptop obj : listObj) {
                    if (obj.parametrsMap().get(field.toString()).toString()
                            .equals(parametrsForSeach.get(field.toString()))) {
                        if (!result.contains(obj)) {
                            result.add(obj);
                        }
                    }
                }
            }
            for (Object field : fields) {
                ArrayList<laptop> temp = new ArrayList<>(result);
                for (laptop obj : temp) {
                    if (!obj.parametrsMap().get(field.toString()).toString()
                            .equals(parametrsForSeach.get(field.toString()))) {
                        result.remove(obj);
                    }
                }
            }
            if (result.isEmpty()) {
                System.out.println("Ничего не найдено");
            } else {
                for (laptop obj : result) {
                    System.out.println(obj);
                }
            }
        }
    }

    public static Map<String, String> choseParametrs() {
        Map<String, String> parametrs = new HashMap<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите color или оставьте поле пустым:");
        String temp = scan.nextLine();
        if (!temp.equals(""))
            parametrs.put("color", temp.toLowerCase());

        System.out.println("Введите os или оставьте поле пустым:");
        temp = scan.nextLine();
        if (!temp.equals(""))
            parametrs.put("os", temp.toLowerCase());

        System.out.println("Введите hhd или оставьте поле пустым:");
        temp = scan.nextLine();
        if (!temp.equals(""))
            parametrs.put("hhd", temp);

        System.out.println("Введите RAM или оставьте поле пустым:");
        temp = scan.nextLine();
        if (!temp.equals(""))
            parametrs.put("RAM", temp);
        scan.close();
        return parametrs;
    }
}
