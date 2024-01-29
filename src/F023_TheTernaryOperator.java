/*
The Ternary Operator / Тернарный оператор - это оператор,
который позволяет выполнять операцию по условию.
Пример:
int a = int b ? int c : int d;
переменная = условие

*/

public class F023_TheTernaryOperator {
    public static void main(String[] args) {
        int income = 120_000;
//        String className;
//        if (income > 100_000) {
//            className = "First";
//        } else {
//            className = "Economy";
//        }
//        System.out.println(className);

        // оптимизируем код

        String className = income > 100_000 ? "First" : "Economy";

        // Тернарный оператор
        // где income > 100_000 ? "First" : "Economy"
        // если income > 100_000 то "First" если нет то "Economy", подробнее:
        //      ">" - больше
        //      "?" - это тернарный оператор, после "?" первое значение, после ":" второе значение
        //      ":" - это оператор, который будет выполняться, если предыдущее условие не сработало
        //              "First" - это первое значение
        //              "Economy" - это второе значение

        System.out.println(className);

    }
}
