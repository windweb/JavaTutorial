/* For Each Loop / Цикл for-each
forEach - это цикл, который можно использовать для перебора коллекции.
Синтаксис такой:
forEach(тип_данных переменная : коллекция) { ... }


*/

public class F030_ForEachLoop {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        // вариант 1 с использованием цикла for
/* вариант с циклом for более гибкий, так как
можно перебирать коллекции любых типов
с использованием индексации с начала или с конца*/
        System.out.println("\n" + "цикл for, индексация с начала"+"\n");

        for (int i = 0; i < cars.length; i++) // индексация с начала
            System.out.println(cars[i]);

        System.out.println("\n" +"цикл for, индексация с конца"+"\n");

        for (int i = cars.length - 1; i >= 0; i--) // индексация с конца
            System.out.println(cars[i]);

        System.out.println("-------");
        System.out.println("\n" + "цикл foreach, индексация с начала"+"\n");
        // вариант 2 с использованием foreach

        for (String currentCar : cars)  // индексация только с начала
            System.out.println(currentCar);

    }
}
