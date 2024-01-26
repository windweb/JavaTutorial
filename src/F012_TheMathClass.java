public class F012_TheMathClass {
    public static void main(String[] args) {
        int result = Math.round(1.1F); // Округлить до целого
        System.out.println(result); // 1

        int result2 = (int)Math.ceil(1.1F); // Округлить вверх
        System.out.println(result2); // 2

        int result3 = (int)Math.floor(1.1F); // Округлить вниз
        System.out.println(result3); // 1

        int result4 = (int)Math.max(1, 2); // Максимальное значение
        System.out.println(result4); // 2

        double result5 = Math.random(); // Случайное число в диапазоне от 0 до 1 с дробной частью
        System.out.println(result5); // 0.4368805334217625

        double result6 = Math.random() * 100; // Случайное число в диапазоне от 0 до 100 с дробной частью
        System.out.println(result6); // 49.123

        int result7 = (int) Math.round(Math.random() * 100); // Случайное число в диапазоне от 0 до 100 с округлением до целого
        System.out.println(result7); // 49
        // но
        int result8 = (int) Math.random() * 100; // всегда 0
        System.out.println(result8); // всегда = 0
        // однако
        int result9 = (int) (Math.random() * 100); // Случайное число в диапазоне от 0 до 100 с округлением до целого
        System.out.println(result9); // 49

    }

}
