/*
For Loop / Цикл for
for - цикл, который выполняется до тех пор, пока условие выполнится

Пример:

for (объявление; условие; итерация) {
    тело цикла
}
*/


public class F026_ForLoops {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        System.out.println("Hello World!");
//        System.out.println("Hello World!");
//        System.out.println("Hello World!");
//        System.out.println("Hello World!");
        for (int i = 0; i < 5; i++)
            System.out.println("Hello World! " + i);

        System.out.println('\n');

        for (int i = 5; i > 0; i--)
            System.out.println("Hello World! " + i);

    }
}
