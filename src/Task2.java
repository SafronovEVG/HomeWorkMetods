import java.time.LocalDate;
import java.util.Scanner;
import java.util.SortedMap;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какое у вас устройство? 0 - IOS 1 - Android");
        int iosPhone = scanner.nextInt();
        String phone = checkIos(iosPhone);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите год вашего устройства");
        int yearPhone = scanner1.nextInt();
        String version = YearPhone(yearPhone);
    }

    public static String checkIos(int ios) {
        if (ios == 0) {
            System.out.println("Ваше устройство на IOS");
        } else {
            System.out.println("Ваше устройство на Android");
        }
        return null;
    }

    public static String YearPhone(int year) {
        int currentYear = 2015;
        if (year < currentYear) {
            System.out.println("Установите облегченную версию приложения");
        } else {
            System.out.println("Установите полную версию приложения");
        }
        return null;
    }
}
