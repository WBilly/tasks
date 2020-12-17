package javazadachi;

import java.util.ArrayList;

/*
     Интересная задачка
     Для проверки остаточных знаний учеников после летних каникул, учитель младших классов решил начинать
     каждый урок с того, чтобы задавать каждому ученику пример из таблицы умножения, но в классе 15 человек.
     В помощь учителю напишите программу, которая будет выводить
     на экран 15 случайных примеров из таблицы умножения (от 1*2 до 10*10).

 */
public class Task07 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;
        }
//        System.out.println("arr1: ");
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.print(arr1[i] + "; ");
//        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }
//        System.out.println("\narr2: ");
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.print(arr2[i] + "; ");
//        }
        String[] arr3 = new String[100];
        int k = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10  ; j++) {
                arr3[k] = arr1[i] + " * " + arr2[j];
                k++;
            }
        }

//        System.out.println("\narr3: ");
//        for (int i = 0; i < arr3.length ; i++) {
//            System.out.print(arr3 [i]+ "; ");
//        }

        tasks (arr3);

    }
    public static void tasks (String [] arr3) {
        System.out.println("Список примеров для решения: ");
        for (int i = 0; i < 14 ; i++) {
            int number = (int) (Math.random() * 100);
            System.out.println((i + 1) + ". " + arr3[number] + "= ; ");
        }
    }
}
