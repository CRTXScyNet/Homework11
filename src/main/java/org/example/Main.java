package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Task one
        checkIfLeapYear(2000);

        //Task two
        int clientOS = 0;
        int currentYear = LocalDate.now().getYear();
        checkOSVersion(clientOS, currentYear);

        // Task three
        int deliveryDistance = 150;
        int daysToDeliver = calculateDeliveryDaysCount(deliveryDistance);
    }

    public static void checkIfLeapYear(int year) {
        String leapYear = " год является високосным";
        String notLeapYear = " год не является високосным";
        if (year <= 1584) {
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

    public static void checkOSVersion(int clientOS, int currentYear) {
        int yearOfManufacture = 2024;
        if (clientOS == 1) {
            if (yearOfManufacture >= currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else if (clientOS == 0) {
            if (yearOfManufacture >= currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
    }

    public static int calculateDeliveryDaysCount(int distance) {
        if (distance < 20) {
            return 1;
        } else if (distance >= 20 && distance < 60) {
            return 2;
        } else if (distance >= 60 && distance < 100) {
            return 3;
        } else {
            return -1;
        }
    }
}