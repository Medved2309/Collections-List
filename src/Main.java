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
            System.out.println("4 - Завершить программу и показать итоговый список");
            int operationNum = Integer.parseInt(scanner.nextLine());

            if (operationNum == 1) {
                System.out.println("Какую покупку хотите добавить? Введите название");
                String nameProduct = scanner.nextLine();
                shoppingList.add(nameProduct);
                System.out.println("Добавлен: " + nameProduct + ". " + " Итого наименований в списке продуктов: " + shoppingList.size());

            } else if (operationNum == 2) {
                vivodShoppList(shoppingList);

            } else if (operationNum == 3) {
                vivodShoppList(shoppingList);
                System.out.println("Какую покупку хотите удалить из списка? Ведите номер или наимнование продукции:");
                String operationDel = scanner.nextLine();
                if (operationDel.matches("\\d")) {
                    int numb = Integer.parseInt(operationDel) - 1;
                    if (numb < 0 || numb > shoppingList.size()) {
                        System.out.println("Некоректный ввод");
                    }
                    String list = shoppingList.get(numb);
                    shoppingList.remove(numb);
                    System.out.println("Покупка: " + list + " удалена.");
                    vivodShoppList(shoppingList);
                } else {
                    shoppingList.remove(operationDel);
                    System.out.println("Покупка: " + operationDel + " удалена.");
                    vivodShoppList(shoppingList);
                }
            } else if (operationNum == 4) {
                vivodShoppList(shoppingList);
                break;
            }


        }
    }


    private static void vivodShoppList(ArrayList<String> shoppingList) {
        if (shoppingList.isEmpty()) {
            System.out.println("Список продуктов пуст");
        } else {
            System.out.println("Список продуктов:");
            for (int i = 0; i < shoppingList.size(); i++) {
                System.out.println((i + 1) + ". " + shoppingList.get(i));
            }

        }
    }


}