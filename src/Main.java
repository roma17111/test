public class Main {
    public static void main(String[] args) {
       // задача 1//
        byte clientOS = 0;
        if (clientOS ==0) {System.out.println("Установите версию приложения для iOS по ссылке");}
        else if (clientOS ==1) {System.out.println("Установите версию приложения для android по ссылке");}
        else {System.out.println("Error");}

        int clientDeviceYear = 2014;
        if (clientDeviceYear < 2015 && clientOS ==0) {System.out.println("Установите облегченную версию" +
                " приложения для iOS по ссылке");}
        else if (clientDeviceYear < 2015 && clientOS ==1) {System.out.println("Установите облегченную версию" +
                " приложения для android по ссылке");}
        else if (clientDeviceYear >= 2015 && clientOS ==0) {System.out.println("Установите обычную версию приложения " +
                "для iOS по ссылке");}
        else if (clientDeviceYear >= 2015 && clientOS ==1) {System.out.println("Установите обычную версию приложения " +
                "для android по ссылке");}
        else {System.out.println("Error");}
    }
}