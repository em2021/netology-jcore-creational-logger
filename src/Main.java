import java.util.Random;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Main {

    public static void printList(List<Integer> list) {
        for (int i : list) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        while (true) {
            logger.log("Просим пользователя ввести входные данные для списка");
            System.out.print("Введите размер списка: ");
            Scanner scanner = new Scanner(System.in);
            int listSize = scanner.nextInt();
            System.out.print("Введите верхнюю границу для значений: ");
            int valueLimit = scanner.nextInt();
            logger.log("Создаём и наполняем список");
            List<Integer> list = new ArrayList<>();
            Random random = new Random();
            for (int i = 0; i < listSize; i++) {
                list.add(random.nextInt(valueLimit));
            }
            System.out.print("Вот случайный список: ");
            printList(list);
            logger.log("Просим пользователя ввести входные данные для фильтрации");
            System.out.print("Введите порог для фильтра: ");
            int f = scanner.nextInt();
            Filter filter = new Filter(f);
            list = filter.filterOut(list);
            logger.log("Выводим результат на экран");
            System.out.print("Отфильтрованный список: ");
            printList(list);
            logger.log("Завершаем программу");
            break;
        }
    }
}