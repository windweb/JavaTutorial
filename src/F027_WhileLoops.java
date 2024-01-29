/* While loops / Цикл while
while - цикл, который выполняет определенное количество итераций до тех пор,
        пока пока выражение истинно.

Пример:
while (условие) {
    // do something, до тех пор пока условие истинно
}

*/

import java.util.Scanner;

public class F027_WhileLoops {
    public static void main(String[] args) {
//        for (int i = 5; i > 0; i--)
//            System.out.println("Hello World! " + i);
        // перепишем код выше с использованием цикла while

        int i = 5;
        while (i > 0) {
            System.out.println("Hello World! " + i);
            i--;
        }

        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("stop")) {
            System.out.print("Enter something or 'stop': ");
            input = scanner.next().toLowerCase();
            System.out.println("You entered: " + input);
        }



    }
}
