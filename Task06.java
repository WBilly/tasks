package javazadachi;
/*
Создать статический метод, который будет иметь два целочисленных параметра a и b,
и в качестве своего значения возвращать случайное целое число из отрезка [a;b].
 */
public class Task06 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 10);
        System.out.println("Первое случайное число это: " + a);

        int b = (int) (Math.random() * 10);
        System.out.println("Второе случайное число это: " + b);

        randValue(a, b);

    }

    public static int randValue(int a, int b) {
        int arrleng = 0;

        if (b > a) {
            arrleng = (b - a) + 1;
            System.out.println("Массив состоит из " + arrleng + " значений.");
        } else if (b < a) {
            arrleng = (a - b) + 1;
            System.out.println("Массив состоит из " + arrleng + " значений.");
        } else {
            System.out.println("Массив состоит из одного числа: " + a);
        }
        int[] array = new int[arrleng];

        // заполняем массив из последовательных значений в промежутке между значениями а и b;
        for (int i = 0; i < array.length; i++) {
            array[i] = a + i;
        }
        // выводим на экран массив;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "; ");
        }
        // получаем случайную позицию в массиве;
        int numRand = (int) (Math.random() * (arrleng - 1));
        System.out.println("\nСлучайная позиция в массиве: " + numRand);
        System.out.println("Значение случайного номера по порядку в массиве: " + array[numRand]);

        return array[numRand];
    }
}
