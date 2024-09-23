public class Main {
    public static void main(String[] args) {
    // task 1
        System.out.println("Task 1");
        byte clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Используется иная, отличная ОС");
        }

        // task 2
        System.out.println("Task 2");
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else System.out.println("Используется иная, отличная ОС");

        // task 3
        System.out.println("Task 3");
        int year = 2021;
        if (year > 1584 && ((year % 4 == 0 && year % 100 != 0)) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else System.out.println(year + " год не является високосным");

        // task 4
        System.out.println("Task 4");
        int deliveryDistance = 195;
        int days;

        if (deliveryDistance <= 20) {
            days = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <=60) {
            days = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <=100) {
            days = 3;
        } else {
            days = -1;
        }
            if (days !=-1) {
            System.out.println("Потребуется дней: " + days);
        } else System.out.println("Доставки нет");

        // task 5
        System.out.println("Task 5");
        byte monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зимний период");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний период");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний период");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний период");
                break;
        }

//        if (monthNumber <= 2 && monthNumber == 12) {
//            System.out.println("Сейчас зимний сезон");
//        } else if (monthNumber >=3 && monthNumber <=5) {
//            System.out.println("Сейчас весенний сезон");
//        } else if (monthNumber >=6 && monthNumber <=8) {
//            System.out.println("Сейчас летний сезон");
//        } else if (monthNumber >=9 && monthNumber <=11) {
//            System.out.println("Сейчас осенний сезон");
//        }
    }

    }