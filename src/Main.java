import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите номер операции:");
            System.out.println("1 - Добавить в список покупок");
            System.out.println("2 - Показать список покупок");
            System.out.println("3 - Удалить из списка покупок");
            int input = Integer.parseInt(scanner.nextLine());

            if (input == 1) {
                System.out.println("Какую покупку хотите добавить? Введите название");
                String nameProduct = scanner.nextLine();
                shoppingList.add(nameProduct);
                System.out.println("Итого наименований в списке продуктов: " + shoppingList.size());

            } else if (input == 2) {
                System.out.println("Список добавленных продуктов:");
                for ( int i = 0; i < shoppingList.size(); i++){
                    System.out.println((i+1) + ". " + shoppingList.get(i));
                }

            } else if (input == 3) {

            }


        }


    }
}