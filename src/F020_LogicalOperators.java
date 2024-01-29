/* Logical Operators / Логические операторы
        "||" - оператор OR
        "&&" - оператор AND
        "!" - оператор NOT
*/
public class F020_LogicalOperators {
    public static void main(String[] args) {
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);
        // изменим temperature на 12
        temperature = 12;
        isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = ((hasHighIncome || hasGoodCredit) && !hasCriminalRecord);
        // "||" - это оператор OR
        // "&&" - оператор AND
        System.out.println(isEligible);
    }
}
