import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static int checkLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " не високосный год");
        }
        return year;
    }


    public static void task1() {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        int year = 2021;
        checkLeapYear(year);
    }

    public static int getClientOS(int nameOS, int deviceYear) {
        if (nameOS == 0 && deviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (nameOS == 0 && deviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (nameOS == 1 && deviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (nameOS == 1 && deviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Уточните параметры телефона");
        }
        return -1;
    }

    public static void task2() {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
        int clientOS = 0;
        int currentYear = LocalDate.now().getYear();
        getClientOS(clientOS, currentYear);

    }

    public static int deliver(int distance) {
        int days=0;

        if (distance > 0 && distance <= 20) {
            days = days+1;
        } else if (distance > 20 && distance <= 60) {
            days = days+2;
        } else if (distance > 60 && distance <= 100) {
            days = days+3;
        } else if(distance>100){
            System.out.println("Свыше 100 км доставки нет");
        }


        return days;
    }
    public static void printDays(int days){
        System.out.println("На доставку потребуется дней: " + days);

    }

    public static void task3() {
        System.out.println("Задача 3");
        // Пишем код для задачи 3
       int deliveryDistance = 95;
       int days = deliver(deliveryDistance);
       printDays(days);


    }
}