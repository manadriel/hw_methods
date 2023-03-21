import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void calculationLeapYear (int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static int calculationOfDeliveryDays (int distanse) {
        int a = 1;
        int b = a++;
        int c = b++;
        int d = 0;
        System.out.println("Ваша дистанция для доставки: " + distanse);
        if (distanse < 20) {
            System.out.println("Потребуется дней для доставки: " + a);
            return a;
        } else if (distanse > 20 && distanse < 60) {
            System.out.println("Потребуется дней для доставки: " + b);
            return b;
        } else if (distanse > 60 && distanse < 100) {
            System.out.println("Потребуется дней для доставки: " + c);
            return c;
        } else {
            System.out.println("Доставки нет " + d);
            return d;

        }
    }

    public static int defineApp(int system, int year) {
        int currentYear = LocalDate.now().getYear();
        if (year < currentYear) {
            if (system == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                return 0;
            } else if (system == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
                return 1;
            } else {
                if (system == 0) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    return 0;
                } else if (system == 1) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                    return 1;
                }
            }
        }

        return currentYear;
    }


    public static void task1() { //year with 366 days but as method
        System.out.println("Задача 1");
        int year = 2013;
        calculationLeapYear(year);
    }

    public static void task2() { //task with app and system OS and year
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2014;
        defineApp(clientOS, clientDeviceYear);
    }

    public static void task3() { //delivery
        System.out.println("Задача 3");
        int deliveryDistance = 69;
        calculationOfDeliveryDays(deliveryDistance);
    }

}
