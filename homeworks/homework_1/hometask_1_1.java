/*
Задание 1.
Вычислить сумму чисел от 1 до n, вычислить n! произведение чисел от 1 до n
//при подсчете 1 и n включил в интервал чисел от 1 до n
*/

package homework_1;

import java.util.Scanner;

public class hometask_1_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите положительное целое число n больше единицы");
        boolean flag = iScanner.hasNextInt();
        // System.out.println(flag);
        if (flag == true) {
            int number = Integer.parseInt(iScanner.nextLine());
            if (number > 1) {
                System.out.printf("Проверка: вы ввели число %s. \n", number);
                iScanner.close();
                int sum = 0;
                for (int i = 1; i <= number; i++) {
                    sum = sum + i;
                }
                System.out.printf("Сумма чисел от 1 до %s равно %s. \n", number, sum);
                int mult = 1;
                for (int i = 2; i <= number; i++) {
                    mult = mult * i;
                }
                System.out.printf("Произведение чисел от 1 до %s равно %s \n", number, mult);
            } else {
                System.out.printf("Ошибка 01 - введенное число не удовлетворяет требованиям. Надо было ввести положительное целое число n больше одного \n");
            }
        } else {
            System.out.printf("Ошибка 02 - введены буквы. Надо было ввести положительное целое число n больше одного \n");
        }
    }
}
