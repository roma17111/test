public class Main {
    public static void main(String[] args) {
       // задача 1//
        byte clientOS = 1;
        if (clientOS ==0) {System.out.println("Установите версию приложения для iOS по ссылке");}
        else if (clientOS ==1) {System.out.println("Установите версию приложения для android по ссылке");}
        else {System.out.println("Error");}
    }
}