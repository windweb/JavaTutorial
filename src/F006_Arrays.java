import java.util.Arrays;

public class F006_Arrays {
    public static void main(String[] args) {

        /*
        int[] numbers = new int [5];
//        System.out.println(numbers);
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
        numbers[0] = 1;
        numbers[1] = 2;
//        numbers[10] = 3;  // будет ошибка, так как не хватает элементов в массиве
*/
        int[] numbers = {2, 3, 5, 1, 4};
        System.out.println(numbers.length);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}
