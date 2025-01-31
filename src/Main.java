import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int userGuess;
        int attempts = 0;
        System.out.println("Компьютер загадал число от 1 до 100. Его необходимо угадать!");

        while (true) {
            System.out.print("Введите число: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < secretNumber) {
                System.out.println("Я сам в шоке, но, загаданное число больше, брат");
            } else if (userGuess > secretNumber) {
                System.out.println("Не ожидал от тебя такого. Загаданное число меньше, брат");
            } else {
                System.out.println("Поздравляю! Ты угадал число " + secretNumber + " за " + attempts + " попыток.");
                break; 
            }
        }
    }
}
