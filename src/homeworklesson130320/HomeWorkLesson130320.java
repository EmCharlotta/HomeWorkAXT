package homeworklesson130320;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkLesson130320 {
    public static void main(String[] args) {
        //Даны 2 слова, состоящие из четного числа букв.
        // Получить слово состоящее из первой половины первого слова и второй половины второго слова.
        String word1 = "макароны";
        String word2 = "томаты";
        System.out.println(word1.substring(0, word1.length()/2)+word2.substring(word2.length()/2));

        //Найдите самое длинное слово в предложении, при условии, что в предложении все слова разной длины.
        String string = "When we are young";
        String[] strings = string.split("\\s");
        String stringFinal = "a";
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() > stringFinal.length()) {
                stringFinal = strings[i];
            }
        }

        //Написать функцию, которая проверяет, является ли строка палиндромом.
        // Палиндром — это слово или фраза, которые одинаково читаются по буквам или по словам как слева
        // направо, так и справа налево.
        String strPal = "tacocat";
        byte[] bytes = strPal.getBytes();
        System.out.println(Arrays.toString(bytes));
        String strCheck = strPal;
        byte[] bytes2 = strCheck.getBytes();
        int j = strPal.length() - 1;
        for (int i = 0; i < strCheck.length(); i++) {
            bytes2[j] = bytes[i];
            j--;
        }
        System.out.println(Arrays.toString(bytes2));
        if (Arrays.equals(bytes, bytes2)) {
            System.out.println("является палиндромом");
        } else {
            System.out.println("не является палиндромом");
        }

        //Пользователь вводит названия городов через пробел.
        // Вы их присваиваете переменной.
        // Переставьте названия так, чтобы они были упорядочены по алфавиту.
        Scanner city = new Scanner(System.in);
        System.out.println("Введите названия городов через пробел");
        String stringCity = city.nextLine();
        String [] stringArray = stringCity.split("\\s");
        Arrays.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));




    }

}