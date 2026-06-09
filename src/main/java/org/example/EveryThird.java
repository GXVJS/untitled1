import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class EveryThird {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество игроков: ");
        int n = scanner.nextInt();

        System.out.print("Введите номер игрока, с которого начинается счёт: ");
        int startPlayer = scanner.nextInt();

        // Создаём круговой список игроков
        LinkedList<Integer> players = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            players.add(i);
        }

        ArrayList<Integer> result = new ArrayList<>();

        // Находим стартовую позицию
        int currentIndex = players.indexOf(startPlayer);

        while (!players.isEmpty()) {
            // Делаем 2 шага вперёд (третий элемент относительно текущего)
            currentIndex = (currentIndex + 2) % players.size();

            int eliminated = players.get(currentIndex);
            result.add(eliminated);

            // Выводим текущее состояние
            System.out.println(players + " => " + eliminated + " выбывает, результат: " + result);

            players.remove(currentIndex);

            // После удаления элемента currentIndex уже указывает на следующего игрока
            if (!players.isEmpty()) {
                currentIndex = currentIndex % players.size();
            }
        }

        System.out.println("\nПорядок выбывания: " + result);
        System.out.println("Победитель: " + result.get(result.size() - 1));

        scanner.close();
    }
}