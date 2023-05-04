package ru.roman;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
        task3();
    }

    public static void printCheckingYear(int yearCount) {
        if (yearCount % 4 == 0 && yearCount % 100 != 0 || yearCount % 400 == 0) {
            System.out.println(yearCount + " год-високосный год");
        } else {
            System.out.println(yearCount + " год-невисокосный год");

        }
    }

    public static void task1() {
        int year = 2021;
        printCheckingYear(year);
    }


    public static void printCheckingDeviseOS(int yearDevise, int oS) {
        if (oS == 0 && yearDevise >= 2015) {
            System.out.println("Установите наше приложение для IOS по ссылке");
        } else if (oS == 1 && yearDevise >= 2015) {
            System.out.println("Установите наше приложение для Android по ссылке");
        } else if (oS == 1 && yearDevise < 2015) {
            System.out.println("Установите облегченное приложение для Android по ссылке");
        } else {
            System.out.println("Установите облегченное приложение для IOS по ссылке");
        }
    }

        public static void task2 () {
            int clientDeviceYear = 2014;
            int opSystem = 1;
            printCheckingDeviseOS(clientDeviceYear, opSystem);
        }
        public static void printDays(int pDays){
            if (pDays>0) {
                System.out.println("Потребуется дней: " + pDays);
            }else {System.out.println("Доставка невозможна");
            }
        }
        public static int dayCount(int distanse, int daysCount){
            if (distanse < 20) {
                daysCount++;
            } else if (distanse < 60) {
                daysCount+=2;
            } else if (distanse < 100) {
                daysCount+=3;
            }else {
                daysCount+=0;
            }
            return daysCount;
        }

    public static void task3() {
        int deliveryDistance=95;
        int days = 0;
        int number=dayCount(deliveryDistance, days);
        printDays(number);
    }
    }