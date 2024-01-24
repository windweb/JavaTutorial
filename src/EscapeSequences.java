/*
Escape-последовательности в Java используются для представления некоторых специальных символов в строках,
которые иначе нельзя было бы просто включить. Эти последовательности начинаются с обратной косой черты (\\),
за которой следует один или несколько символов, имеющих специальное значение.
Вот некоторые из наиболее часто используемых escape-последовательностей в Java:

1. **`\\n`**: Перевод строки. Используется для создания новой строки.
2. **`\\t`**: Горизонтальный табулятор. Используется для добавления горизонтального отступа в строке.
3. **`\\b`**: Забой. Удаляет предыдущий символ.
4. **`\\r`**: Возврат каретки. Перемещает курсор на начало строки, не создавая новой строки.
5. **`\\f`**: Перевод страницы. Используется для печати документов, но редко встречается в современном программировании.
6. **`\\'`**: Одинарная кавычка. Используется для помещения символа одинарной кавычки в строку.
7. **`\\"`**: Двойная кавычка. Используется для помещения символа двойной кавычки в строку.
8. **`\\\\`**: Обратная косая черта. Используется для помещения символа обратной косой черты в строку.
9. **`\\uxxxx`**: Юникод-символ (где xxxx - это шестнадцатеричное значение символа).
                    Используется для представления символов Юникода.

Эти последовательности особенно полезны при работе с текстом,
где необходимо вставить специальные символы или отформатировать вывод.
Например, чтобы включить новую строку в текстовую строку, вы можете использовать `\\n`:

 */

public class EscapeSequences {
    public static void main(String[] args) {
        // \n : Перевод строки. Используется для создания новой строки.
        System.out.println("First line\nSecond line");

        // \t : Горизонтальный табулятор. Используется для добавления горизонтального отступа.
        System.out.println("First column\tSecond column");

        // \b : Забой. Удаляет предыдущий символ.
        System.out.println("abcdef\b");

        // \r : Возврат каретки. Перемещает курсор на начало строки.
        System.out.println("Line end\rStart");

        // \f : Перевод страницы. Используется редко, особенно в современном программировании.
        System.out.println("Page start\fNew page");

        // \' : Одинарная кавычка. Используется для помещения символа одинарной кавычки в строку.
        System.out.println("Single quote: \'");

        // \" : Двойная кавычка. Используется для помещения символа двойной кавычки в строку.
        System.out.println("Double quote: \"");

        // \\ : Обратная косая черта. Используется для помещения символа обратной косой черты в строку.
        System.out.println("Backslash: \\");

        // косая черта + uXXXX : Юникод-символ (где XXXX - это шестнадцатеричное значение символа).
        System.out.println("Unicode character: \u00A9");
    }
}

/*

Этот код выведет две строки:


First line
Second line
/*

Escape-последовательности делают возможным более точное управление текстовыми строками в Java.
 */

/*

\\n: Newline. Used to create a new line.
\\t: Horizontal tab. Used to add horizontal indentation in a string.
\\b: Backspace. Removes the previous character.
\\r: Carriage return. Moves the cursor to the beginning of the line without creating a new line.
\\f: Form feed. Used for printing documents, but rarely used in modern programming.
\\': Single quote. Used to include a single quote character in a string.
\\": Double quote. Used to include a double quote character in a string.
\\\\: Backslash. Used to include a backslash character in a string.
\\uxxxx: Unicode character (where xxxx is the hexadecimal value of the character). Used to represent Unicode characters.

 */