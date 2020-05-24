package com.UsmanAdd;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception{
        String filter, line;
        String file = "pz1/src/main/resources/poem.txt";
        int answer;
        int numberOfDots = 0;
        WorkWithFile employee = new WorkWithFile(file);
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> text = new ArrayList<String>();

        //Инициализация
        System.out.println("Исходный текст\n");
        employee.reader();
        System.out.print("\nВведите слово-фильтр/фразу-фильтр: ");
        filter = scanner.nextLine();
        System.out.println("\nВаше слово-фильтр: " + filter);

        //Вывод отфильтрованного текста
        System.out.println("\nОтфильтрованный текст");
        System.out.println("-------------------------------");
        employee.spilling(filter);

//        //Разбиение текста на предложения
//        for (int i = 0; i < line.length(); i++) {
//            if (line.charAt(i) == '.' || line.charAt(i) == '?' || line.charAt(i) == '!') {
//                text.add(line.substring(numberOfDots, i + 1));
//                numberOfDots = i + 2;
//            }
//        }

    }
}
