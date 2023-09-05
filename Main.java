package numbers;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
// Попробовать каждые введеные цифры = объекты
        // в зависимости от количество параметров сделать Method overloading
        // в каждом объекте сделать чек на возможные ошибки
        String number = null;
        System.out.println("Welcome to Amazing Numbers!");
        Properties.printInstruction();
        Scanner scanner = new Scanner(System.in);
        DoWhileClass.doWhilePart(number, scanner);
    }

}