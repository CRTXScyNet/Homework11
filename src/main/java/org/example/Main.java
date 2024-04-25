package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Task one
        checkIfLeapYear(2000);

        //Task two
        int clientOS = 0;
        int clientDeviceYear = 2024;
        checkOSVersion(clientOS, clientDeviceYear);

        // Task three
        int deliveryDistance = 150;
        int daysToDeliver = calculateDeliveryDaysCount(deliveryDistance);
    }


    // Проверка, является ли год високосным
    public static void checkIfLeapYear(int year) {
        String leapYear = " год является високосным";
        String notLeapYear = " год не является високосным";
        if (year <= 1582) {
            System.out.println(year + notLeapYear);
        } else if (year % 400 == 0) {
            System.out.println(year + leapYear);
        } else if (year % 4 == 0) {
            if (year % 100 == 0) {
                System.out.println(year + notLeapYear);
            } else {
                System.out.println(year + leapYear);
            }
        } else {
            System.out.println(year + notLeapYear);
        }

    }


    // Определяем для какой операционки ставить приложение и какую версию
    public static void checkOSVersion(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 1) {
            if (clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else if (clientOS == 0) {
            if (clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
    }

    // Вычисляем кол-во дней, необходимых для доставки
    public static int calculateDeliveryDaysCount(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return 1;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            return 2;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            return 3;
        } else {
            throw new IllegalArgumentException("\"Свыше 100км доставка не осуществляется\"");
        }
    }
}