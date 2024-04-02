import java.util.ArrayList;
import java.util.Scanner;


public class two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> todoList = new ArrayList<String>();


        int choice = 0;


        while (choice != 4) {
            System.out.println("Меню:");
            System.out.println("1. Добавить дело");
            System.out.println("2. Вывести список дел");
            System.out.println("3. Удалить дело по индексу");
            System.out.println("4. Выйти");


            System.out.print("Выберите пункт меню: ");
            choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {
                case 1:
                    System.out.print("Введите новое дело: ");
                    String newTodo = scanner.nextLine();
                    todoList.add(newTodo);
                    System.out.println("Дело \"" + newTodo + "\" добавлено в список");
                    break;
                case 2:
                    System.out.println("Список дел:");
                    for (int i = 0; i < todoList.size(); i++) {
                        System.out.println((i) + ". " + todoList.get(i));
                    }
                    break;
                case 3:
                    System.out.print("Введите индекс дела, которое нужно удалить: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    if (index >= 0 && index <= todoList.size()) {
                        String removedTodo = todoList.remove(index);
                        System.out.println("Дело \"" + removedTodo + "\" удалено из списка");
                    } else {
                        System.out.println("Некорректный индекс");
                    }
                    break;
                case 4:
                    System.out.println("До свидания!");
                    break;
                default:
                    System.out.println("Некорректный пункт меню");
                    break;
            }
        }


        scanner.close();
    }
}
