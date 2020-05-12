package com.UsmanAdd;

import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Vector<String> text = new Vector<String>();
        String filter, line;
        int answer;
        int numberOfDots = 0;

        System.out.println("Введите слово-фильтр/фразу-фильтр");
        filter = scanner.nextLine();
        System.out.println("Введите ваш текст");
        line = scanner.nextLine();
        System.out.println("\nВаше слово-фильтр: " + filter);
        System.out.println("Ваш исходный текст: " + line);

        //Разбиение текста на предложения
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '.' || line.charAt(i) == '?' || line.charAt(i) == '!') {
                text.add(line.substring(numberOfDots, i + 1));
                numberOfDots = i + 2;
            }
        }

        //Вывод отфильтрованного текста
        System.out.println("\nОтфильтрованный текст");
        System.out.println("-------------------------------");
        for (int i = 0; i < text.size(); i++) {
            if (text.get(i).toUpperCase().contains(filter.toUpperCase())) {
                System.out.print(text.get(i) + " ");
            }
        }
    }
}
