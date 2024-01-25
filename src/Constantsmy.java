public class Constantsmy {
    public static void main(String[] args) {
        final float pi = 3.14F; // константа обязательно должна быть инициализирована словом final
        pi = 1; // ошибка: константа не может быть переопределена
        System.out.println(pi);

    }
}
