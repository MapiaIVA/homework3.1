import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите время (от 0 до 24): ");
        int time = scanner.nextInt();

        if (time >= 0 && time < 12) {
            System.out.print("Доброе утро");
        } else if (time >= 12 && time < 18) {
            System.out.println("Добрый день");
        } else if (time >= 18 && time < 24) {
            System.out.println("Добрый вечер");
        } else {
            System.out.println("Некорректное время");
        }
    }
}