import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год");
        int year = scanner.nextInt();
        String srting = checkYear(year);
    }

    public static String checkYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                System.out.println("Год не високосный");
                return null;
            }
            System.out.println("Год являеться високосным");
        }
        return null;
    }

}
