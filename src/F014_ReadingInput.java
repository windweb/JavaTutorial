import java.util.Scanner;

public class F014_ReadingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // объявляем сканер, где System.in - поток ввода данных в консоль
        System.out.print("Enter your age: "); // печатаем в консоль строку "Enter your age: "

        byte age = scanner.nextByte(); // читаем байт с клавиатуры
        System.out.println("You are " + age + " years old");

        System.out.print("Enter your name: ");
        Scanner scanner2 = new Scanner(System.in);
        String name = scanner2.nextLine().trim(); // читаем строку с удалением пробелов
        System.out.println("Your name is " + name);

    }
}