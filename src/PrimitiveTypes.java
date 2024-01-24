//Примитивные типы (Primitive Types)

/*
В Java примитивные типы данных представляют собой базовые типы, которые хранят простые значения. Они не являются объектами и хранятся непосредственно в памяти. В Java существует 8 примитивных типов:

byte: 8-битное целое число со знаком. Диапазон от -128 до 127.
short: 16-битное целое число со знаком. Диапазон от -32,768 до 32,767.
int: 32-битное целое число со знаком. Диапазон от -2^31 до 2^31-1.
long: 64-битное целое число со знаком. Диапазон от -2^63 до 2^63-1.
float: 32-битное число с плавающей точкой одинарной точности.
double: 64-битное число с плавающей точкой двойной точности.
char: 16-битный символьный тип, представляющий символы Unicode.
boolean: логический тип, который может быть либо true, либо false.

Примитивные типы полезны для работы с простыми числовыми и логическими значениями. Они эффективны по памяти и скорости выполнения.
*/


public class PrimitiveTypes {
    public static void main(String[] args){
        byte age = 30;
        System.out.println(age);

    }
}
