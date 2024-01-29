/* Do-While Loops / Цикл do-while
do-while - цикл, который выполняет определенное количество итераций
до тех пор, пока выражение истинно.

Цикл do-while выполняется хотя бы один раз, потом проверяет условие.

Пример:
do {
    // do something
} while (условие);

*/

import java.util.Scanner;

public class F028_DoWhileLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
//        while (!input.equals("stop")) {
//            System.out.print("Enter something or 'stop': ");
//            input = scanner.next().toLowerCase();
//            System.out.println("You entered: " + input);
//        }

        // перепишем код выше с использованием цикла do-while

        do {
            System.out.print("Enter something or 'stop': ");
            input = scanner.next().toLowerCase();
            System.out.println("You entered: " + input);
        } while (!input.equals("stop"));

    }
}
