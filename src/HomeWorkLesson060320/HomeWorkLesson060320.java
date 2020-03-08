package HomeWorkLesson060320;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkLesson060320 {
    public static void main(String[] args) {
//      1.  Найти наибольший общий делитель (НОД) двух чисел
        System.out.println("Введите первое число");
        Scanner number1 = new Scanner(System.in);
        int num1 = number1.nextInt();
        System.out.println("Введите второе число");
        Scanner number2 = new Scanner(System.in);
        int a;
        int b;
        int num2 = number2.nextInt();
        if (num1 > num2) {
            a = num1;
            b = num2;
        } else {
            a = num2;
            b = num1;
        }

        while (a % b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        System.out.println(b);


        //        2. Дан массив целых чисел. Массив не отсортирован, числа могут повторяться.
//        Необходимо найти в данном массиве такие два числа n и m, чтобы их сумма была равна 7.
//        Например, 2 + 5 = 7, 6 + 1 = 7, -2 + 9 = 7.
//        Постарайтесь решить задачу наиболее оптимальным способом
        int[] arrHome = {7, 13, -10, 6, 18, 3, 3, 15, 4, 87, 90, -90, -90, -3, 6, 11, -4};
        for (int i = 0; i < arrHome.length; i++) {
            for (int j = i + 1; j < arrHome.length; j++) {
                if (arrHome[i] + arrHome[j] == 7)
                    System.out.println(arrHome[i] + " " + arrHome[j]);
                break;
            }
        }
// 3. Заполните массив на N элементов случайным числами и выведете максимальное, минимальное и среднее значение.

        int[] arrayRandom = new int[5];
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = (int) (Math.random() * 30) - 15;
        }
        System.out.println(Arrays.toString(arrayRandom));
        Arrays.sort(arrayRandom);
        System.out.println(arrayRandom[0] + " " + arrayRandom[4]);
        int sum = 0;
        for (int i = 0; i < arrayRandom.length; i++){
            sum += arrayRandom[i];}
        System.out.println((double) sum / 5);

// 4. Пользователь вводит с клавиатуры натуральное число большее 3, которое сохраняется в переменную n.
// Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
//Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
// Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его в консоль
// Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
// Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его в консоль
        int n = 0;
        while (n < 4) {
            System.out.println("Введите число больше 3");
            Scanner number = new Scanner(System.in);
            n = number.nextInt();
            if (n <3){
                System.out.println("Ваше число меньше или равно 3");}
        }
        int[] arrN;
        arrN = new int[n];
        for (int i = 0; i < arrN.length; i++) {
            arrN[i] = (int) (Math.random() * n);
        }

        System.out.println(Arrays.toString(arrN));

        int l = 0;
        for (int i = 0; i < arrN.length; i++) {
            if (arrN[i] % 2 == 0) {
                l++;
            }
        }
        int[] arrN2;
        arrN2 = new int[l];


        int j = 0;
        for (int i = 0; i < arrN.length; i++) {
            if (arrN[i] % 2 == 0) {
                arrN2[j] = arrN[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arrN2));

// 5. Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99].
// Вывести массив в консоль.
// После на отдельной строке вывести в консоль значение максимального элемента этого массива.
        int[][] arrBig = new int[5][8];
        for (int i = 0; i < arrBig.length; i++)
            for (int u = 0; u < 8; u++) {
                arrBig[i][u] = (int) (Math.random() * 198 - 99);
            }
        System.out.println(Arrays.deepToString(arrBig));
        for (int g = 0; g < 5; g++) {
            Arrays.sort(arrBig[g]);
            System.out.println(Arrays.toString(arrBig[g]));}
        int summ = -99;
        for (int d = 0; d < 5; d++) {
            if (arrBig[d][7] > summ)
                summ = arrBig[d][7];
        }
        System.out.println(summ);

    }
}
