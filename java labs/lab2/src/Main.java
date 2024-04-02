import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int seconds;


        do {
            System.out.print("Введите количество секунд для таймера: ");
            seconds = scanner.nextInt();
        } while (seconds < 0);


        for (int i = seconds; i >= 0; i--) {
            System.out.println("Осталось времени: " + i + " секунд");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        System.out.println("Время вышло!");
    }
}
