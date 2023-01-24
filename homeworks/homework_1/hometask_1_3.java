/*
Реализовать простой калькулятор (операции + - / * )
Пример работы программы:

Введите число 1: 2
Введите число 2: 3
Введите операцию: +
Ответ: 5
Введите число 1: 2
Введите число 2: 3
Введите операцию: а
Ответ: Такой операции нет
 */

package homework_1;
import java.util.Scanner;

public class hometask_1_3 {   
    public static int calc(int a, String choice, int b) {
        int result = 0;
        switch (choice) {
            case ("+"):
                result = a + b;
                break;
            case ("-"):
                result = a - b;
                break;
            case ("*"):
                result = a * b;
                break;
            case ("/"):
                result = a / b;
                break;
            default:
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int first_number = iScanner.nextInt();
        System.out.printf(
                "Введите (+) для сложения; (-) для вычетания; (*) для умножения; (/) для деления\n");
        String choice = iScanner.next();
        System.out.printf("Введите второе число: ");
        int second_number = iScanner.nextInt();
        iScanner.close();
        int res = calc(first_number, choice, second_number);
        System.out.printf("Результат: %d %s %d = %d \n", first_number, choice, second_number, res);
    }
}
