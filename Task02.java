package javazadachi.blogspot.com;

import java.lang.reflect.Array;
import java.util.Scanner;

/*
Создать метод, который будет сортировать указанный массив по возрастанию любым известным вам способом,
а таже сможет находить максимальное и минимальное число массива.
 */

public class Task02 {
    public static int size;
    public static int[] arr;
    public static void main(String[] args) {
        System.out.print("Please enter the array's size:");
        size = sc ();
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Please enter the " + (i + 1) + " number:");
            arr[i] = sc();
        }
        System.out.print("\nYou've created the next array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "; ");
        }
        select();

    } // end of method main


    public static void select() {
        System.out.println("\n--------------------------------------------");
        System.out.println("What are you going to do with current array:");
        System.out.println("1. To sort ascending");
        System.out.println("2. To sort descending");
        System.out.println("3. To find MAX number");
        System.out.println("4. To find MIN number");
        System.out.println("5. Exit");
        System.out.println("--------------------------------------------");

        int item = sc();
        if (item >= 0 && item <= 5) {
            if (item == 1) { sortAscending (arr);}
            if (item == 2) { sortDescending(arr);}
            if (item == 3) { getMax(arr);};
            if (item == 4) { getMin(arr);}
            if (item == 5) { exit();}

        } else {
            System.out.println("Нужно ввести число 1, 2, 3 или 4. Повторите выбор: ");
            select(); }
    } // end od method select ()


    public static int sc () { return new Scanner(System.in).nextInt(); }

    public static void sortAscending(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++){
                if (arr[i] > arr[j]) {
                    int buffer = arr[i];
                    arr[i] = arr[j];
                    arr[j] = buffer;
                }
            }
        }
        System.out.print("Array was sorted Ascending: ");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr [i] + "; ");
        }
        select();
    } // end of method sortAscending

    public static void sortDescending (int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++){
                if (arr[i] < arr[j]) {
                    int buffer = arr[i];
                    arr[i] = arr[j];
                    arr[j] = buffer;
                }
            }
        }
        System.out.print("Array was sorted Descending: ");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr [i] + "; ");
        }
        select();
    }; // end of method Descending

    public static void getMax (int [] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("The MAX number is: " + max);
        select();
    } // end of method getMax

    public static void getMin (int [] arr) {
        int min = arr [0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("The MIX number is: " + min);
        select();
    } // end of method getMin

    public static void exit () {
        System.out.println("GoodBye");
    }

} // end of Class
