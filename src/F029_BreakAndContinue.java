/* Break and Continue / Прерывание и переход к следующей итерации цикла
break и continue можно использовать в циклах.

break - прерывание цикла
continue - переход к следующей итерации цикла
pass - ничего не делает

Пример:
while (условие) {
    // do something

    if (условие) {
        // do something
        continue; // переход к следующей итерации цикла
    }

    if (условие) {
        break; // прерывание цикла
    }

    if (условие) {
        pass; // ничего не делает
    }


}
*/

import java.util.Scanner;

public class F029_BreakAndContinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (true) {
            System.out.print("Enter something or 'stop' or 'password': ");
            input = scanner.next().toLowerCase();

            if (input.equals("password"))
                continue; // переход к следующей итерации цикла, но не выхода из цикла

            if (input.equals("stop"))
                break; // выход из цикла while (прерывание цикла)

            System.out.println("You entered: " + input);
        }

    }
}
