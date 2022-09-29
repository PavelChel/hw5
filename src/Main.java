public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 1 and 2");

        int clientOS = 0;
        int clientDeviceYear = 2014;

        if (clientOS == 1 && clientDeviceYear >=2015) {
            System.out.printf(" Установите версию приложения для Android по ссылке");
        }
            if ( clientOS == 1 && clientDeviceYear < 2015){
                System.out.printf(" Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.printf(" Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear <2015) {
            System.out.printf(" Установите облегченную версию приложения для iOS по ссылке");
        }

        System.out.println(" Домашнее задание 3");

            int year = 2020;
            if (year%4==0 && year%100 !=0 || year%400==0)  {
                System.out.printf(" год является високосным");
            } else {
                System.out.printf(" год не является високосным");
            }

        System.out.println(" Домашнее задание 4");
            int deliveryDistance = 95;
            int deliveryDays = 1;

            if (deliveryDistance >20) {
                deliveryDays++;
            }
            if (deliveryDistance >60) {
                deliveryDays++;
            }
        System.out.printf(" Потребуется дней " + deliveryDays);



        System.out.printf(" Домашнее задание 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.printf(" Месяц пренадлежит к Зиме");
                break;
            case 2:
                System.out.printf(" Месяц пренадлежит к Зиме");
                break;
            case 3:
                System.out.printf(" Месяц пренадлежит к Весне");
                break;
            case 4:
                System.out.printf(" Месяц пренадлежит к Весне");
                break;
            case 5:
                System.out.printf(" Месяц пренадлежит к Весне");
                break;
            case 6:
                System.out.printf(" Месяц пренадлежит к Лету");
                break;
            case 7:
                System.out.printf(" Месяц пренадлежит к Лету");
                break;
            case 8:
                System.out.printf(" Месяц пренадлежит к Лету");
                break;
            case 9:
                System.out.printf(" Месяц пренадлежит к Осени");
                break;
            case 10:
                System.out.printf(" Месяц пренадлежит к Осени");
                break;
            case 11:
                System.out.printf(" Месяц пренадлежит к Осени");
                break;
            case 12:
                System.out.printf(" Месяц пренадлежит к Зиме");
                break;
            default:
                System.out.printf(" Введён не корректный месяц");
        }













    }
}