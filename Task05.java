package javazadachi;

import java.util.Scanner;

/*
Задача 5:
Создать статический метод, который будет создавать массив из последовательных чисел,
где начальные и конечные значения - случайные числа от 1 до 10;
 */

public class Task05 {
    public static void main(String[] args) {
        System.out.print("Please, enter the number of arrays, what you want to create: ");
        int value = sc();
        int [] arrList = new int [value];
        for (int i = 0; i < arrList.length ; i++) {
            System.out.println("\nThe " + (i+1) + " array is:");
            System.out.println("--------------------------");
            giveArr();
        }
    }

    public static void giveArr() {
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        if (a > b) {
            int[] arr = new int[a - b + 1];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = b + i;
            }
            System.out.println("The first number of array is :" + b);
            System.out.println("The last number of array is :" + a);
            System.out.print("The list of array's values: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "; ");
            }
        }
            if (a < b) {
                int[] arr = new int[b - a + 1];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = a + i;
                }
                System.out.println("The first number of array is :" + a);
                System.out.println("The last number of array is :" + b);
                System.out.print("The list of array's values: ");
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + "; ");
                }
            }
            if (a == b) {
                int[] arr = new int[1];
                arr[0] = a;
                System.out.println("Array contain only one number: " + a);
            }
        System.out.println();
        }
    public static int sc () {return new Scanner(System.in).nextInt();}
    }
