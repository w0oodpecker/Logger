package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int sizeOfList = 0; //Размер списка чисел
        int highLevelNumber = 0; //Верхняя граница значений в списке
        int treshold = 0; //Фильтр
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        Logger logger = Logger.getInstance();

        logger.log("Запускаем программу");

        try {
            logger.log("Просим пользователя ввести входные данные для списка");
            System.out.println("Введите размер списка чисел");
            sizeOfList = sc.nextInt();
            System.out.println("Введите верхнюю границу значений в списке");
            highLevelNumber = sc.nextInt();
            System.out.println("Введите число для фильтрации списка");
            treshold = sc.nextInt();
        }
        catch(InputMismatchException exc){
            logger.log("Введено некоректное значение " + exc);
            logger.log("Завершаем программу");
            throw new RuntimeException();
        }


        //Заполнение списка случайными числами
        List<Integer> listOfNumber = new ArrayList<>(); //Создаем список для чисел
        for(int index = 0; index < sizeOfList; index++){
            listOfNumber.add(random.nextInt(highLevelNumber));
        }
        System.out.println(listOfNumber.toString());

        //Фильтрация списка
        Filter filter = new Filter(treshold);
        List<Integer> result = filter.filterOut(listOfNumber);
        System.out.println(result.toString());

    }
}