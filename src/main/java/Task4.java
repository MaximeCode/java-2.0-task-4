import java.util.Arrays;
import java.util.Scanner;

/**
 * Created on 25.12.2020
 *
 * @author me
 */
public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Выберете подзадание (1 или 2): ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        if (choice == 1) {
            runSubTask1();
        } else if (choice == 2) {
            runSubTask2();
        } else {
            System.out.println("Неверно выбрано подзадание.");
        }
        scanner.close();
    }

    /**
     * Находит максимальный отрицательный и минимальный положительный элементы в массиве случайных целых чисел
     * от -10 до 10 и меняет их местами.
     */
    public static void runSubTask1() {
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 21) - 10;
        }
        System.out.println("Исходный массив:\t\t\t" + Arrays.toString(numbers));
        int minPositiveNumberIndex = 0;
        int maxNegativeNumberIndex = 0;
        int minPositiveNumber = 10;
        int maxNegativeNumber = -10;
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (number > 0 && number < minPositiveNumber) {
                minPositiveNumberIndex = i;
                minPositiveNumber = number;
            } else if (number < 0 && number > maxNegativeNumber) {
                maxNegativeNumberIndex = i;
                maxNegativeNumber = number;
            }
        }
        numbers[minPositiveNumberIndex] = maxNegativeNumber;
        numbers[maxNegativeNumberIndex] = minPositiveNumber;
        System.out.println("Массив после перестановки:\t" + Arrays.toString(numbers));
    }

    /**
     * Формирует новогодний подарок и выводит информацию о нём.
     */
    public static void runSubTask2() {
        Gift gift = new Gift()
                .setCandies(
                        new Candy(50, 100, 100),
                        new Candy(40, 25, 60),
                        new Candy(45, 65, 50))
                .setJellybeans(
                        new Jellybean(25, 40, "красный"),
                        new Jellybean(70, 110, "жёлтый"),
                        new Jellybean(35, 55, "зелёный"));
        System.out.println(gift);
        System.out.printf("Общий вес подарка %s граммов.\n", gift.getTotalWeight());
        System.out.printf("Общая стоимость подарка %s рублей.\n", gift.getTotalPrice());
    }
}
