//task_1
package seminar_1;

import java.time.LocalDateTime;
//import java.util.Date;
import java.util.Scanner;

public class program_2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in); // создаю объект этого типа
        System.out.printf("Enter your name  ");
        String name = iScanner.nextLine();
        // System.out.println(LocalDateTime.now()); // вывод моего локального времени на
        // экран
        LocalDateTime date = LocalDateTime.now();
        if (date.getHour() >= 5 && date.getHour() < 12) {
            System.out.printf("Доброе утро, %s! ", name);
        } else if (date.getHour() >= 12 && date.getHour() < 18) {
            System.out.printf("Добрый день, %s! ", name);
        } else if (date.getHour() >= 18 && date.getHour() < 23) {
            System.out.printf("Добрый вечер, %s!  ", name);
        } else {
            System.out.printf("Доброй ночи, %s! ", name);
        }
        // System.out.printf("Hello, %s! ", name); //%s - здесь будет какая-то заглушка,
        // и она будет описана далее
        iScanner.close(); // закрываем - высвобождаем объект (память)
    }
}
