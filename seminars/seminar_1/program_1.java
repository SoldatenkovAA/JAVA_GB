//task_1
package seminar_1;
import java.util.Scanner;


public class program_1 {   
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in); //создаю объект этого типа
        System.out.printf("Enter your name  ");
        String name = iScanner.nextLine();
        System.out.printf("Hello, %s!  ", name); //%s - здесь будет какая-то заглушка, и она будет описана далее
        iScanner.close();   //закрываем - высвобождаем объект (память)
    }
}




