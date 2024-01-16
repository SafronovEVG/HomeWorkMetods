import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите расстояние до клиента (км):");
        int distance = scanner.nextInt();
        String delivery = checkDistance(distance);
    }

    public static String checkDistance(int distance) {
        int i = 0;
        if (distance <= 20) {
            i=1;
            System.out.println("Потребуется " + i + " дней на доставку");
        } else if (distance > 20 && distance <= 60) {
            i=2;
            System.out.println("Потребуеться " + i + " дня на доставку");
        } else if (distance > 60 && distance <= 100) {
            i=3;
            System.out.println("Потребуеться " + i + " дня на доставку");

        } else {
            System.out.println("Доставка свыше 100 км не осуществляется!");
        }
        return null;
    }
}
