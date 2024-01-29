/*
Число вводите с клавиатуры.
Если число делится на 5, то выведите Fizz.
Если число делится на 3, то выведите Buzz.
Если число делится и на 5 и на 3, то выведите FizzBuzz.
Если число не делится ни на 5 ни на 3, то выведите само число.
*/

import java.util.Scanner;

public class F025_ExerciseFizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        // ввод целого числа с клавиатуры
        int number = scanner.nextInt();


        // Решение 1:

        if (number % 5 == 0 && number % 3 == 0)
            System.out.println("FizzBuzz");
        else if (number % 5 == 0)
            System.out.println("Fizz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);

/*
        // Решение 2:

        if (number % 5 == 0) {
            if (number % 3 == 0)
                System.out.println("FizzBuzz");
            else
                System.out.println("Fizz");
        }
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);
*/


    }
}
