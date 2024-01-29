public class F022_SimplifyingIfStatements {
    public static void main(String[] args) {

        int income1 = 120_000;
        if (income1 > 100_000) {
            boolean hasHighIncome1 = true;
        }
//        System.out.println(hasHighIncome1);
// ошибка компиляции, так как несмотря на то, что переменная hasHighIncome1
// объявлена внутри блока if,
// но к ней нет доступа вне блока if
        // чтобы решить эту проблему можем сделать следующее:
        int income2 = 120_000;
        boolean hasHighIncome2;
        if (income2 > 100_000)
            hasHighIncome2 = true;
        else
            hasHighIncome2 = false;

        System.out.println(hasHighIncome2);

        // но код выше - выглядит не оптимальным.
        // Вот как его можно оптимизировать
        int income3 = 120_000;
        boolean hasHighIncome3 = false;
        if (income3 > 100_000)
            hasHighIncome3 = true;

        System.out.println(hasHighIncome3);

        // можно ещё оптимизировать код
        int income4 = 120_000;
        boolean hasHighIncome4 = (income4 > 100_000);

        System.out.println(hasHighIncome4);



    }
}
