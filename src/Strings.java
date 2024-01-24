public class Strings {
    public static void main(String[] args) {
        String message = "Hello World" + "!!"; /* Конкатенация строк (+)*/
        System.out.println(message);

        System.out.println(message.endsWith("!!"));  /* endsWith(String suffix):
        // Проверяет, заканчивается ли строка определенным суффиксом.
        // Возвращает true, если message заканчивается на "!!".*/

        System.out.println(message.startsWith("!!")); /* startsWith(String prefix):
        // Проверяет, начинается ли строка с определенного префикса.
        // Возвращает false, так как message не начинается с "!!".*/

        System.out.println(message.indexOf("h"));  //
        System.out.println(message.indexOf("H"));  // indexOf(String str):
        // Возвращает индекс первого вхождения указанной подстроки в строку.
        // Если подстрока не найдена, возвращает -1.
        // В первом случае поиск "h" вернет -1 (так как Java чувствительна к регистру),
        // а поиск "H" вернет 0 (индекс первого символа в строке "Hello World!!").

        System.out.println(message.replace("W", "VV")); // replace(char oldChar, char newChar):
        // Заменяет все вхождения oldChar на newChar в строке.
        // В вашем случае заменяет "W" на "VV", получается "Hello VVorld!!".

        System.out.println(message.toLowerCase()); // toLowerCase(): Преобразует все символы строки в нижний регистр.
        // Результатом будет "hello world!!".
        System.out.println(message.toUpperCase());  // toUpperCase(): Преобразует все символы строки в верхний регистр.

        System.out.println(message.trim()); // trim(): Удаляет начальные и конечные пробелы из строки.
        // В вашем случае строка "Hello World!!" не содержит пробелов на концах, так что результат будет тот же.

        System.out.println(message.length()); // length(): Возвращает длину строки (количество символов в ней).

        System.out.println(message.substring(6, 11)); // substring(int beginIndex, int endIndex):
        // Возвращает подстроку начиная с beginIndex и заканчивая endIndex - 1.

        System.out.println(message.charAt(0)); // charAt(int index): Возвращает символ по указанному индексу.

        System.out.println(message.equals("Hello World!!")); // equals(Object another):
        // метод сравнивает строки на точное совпадение

        System.out.println(message.equalsIgnoreCase("hello world!!")); //
        // equalsIgnoreCase(String anotherString): метод сравнивает строки на совпадение, игнорируя регистр символов.
    }
}
