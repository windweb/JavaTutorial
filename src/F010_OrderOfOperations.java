public class F010_OrderOfOperations {
    public static void main(String[] args) {

        int x = 10 + 3 * 2;
        System.out.println(x);

        int z = (10 + 3) * 2;
        System.out.println(z);
/*
        // Order of Operations is from left to right / Порядок действий слева направо
        // () has the highest precedence / () имеют наивысший приоритет
        * / has the next highest precedence / * / имеют следующий наивысший приоритет
        // + - has the lowest precedence / + - имеют наименьший приоритет
*/
    }
}
