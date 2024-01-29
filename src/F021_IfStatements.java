/* If Statements / Условные операторы if
if - оператор, который выполняет действие только если условие истинно

if (условие) {
    действие
}
*/

/* conditions.txt:

If temp is greater than 30
    It's a hot day
    Drink plenty of water
Otherwise, if it's between 20 and 30
    It's a nice day
Otherwise
    It's cold
*/
/* условия.txt:

Если температура больше 30
    Это жаркий день
    Пейте много воды
В противном случае, если она между 20 и 30
    Это нормальный день
В противном случае
    Это холодный
*/

public class F021_IfStatements {
    public static void main(String[] args) {
        int temp = 20;
        if (temp > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink plenty of water");
        }
        else if (temp < 20)
            System.out.println("It's cold");
        else
            System.out.println("It's a nice day");
    }
}

