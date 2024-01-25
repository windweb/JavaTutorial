import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int[][] numbers = new int[2][3];
        numbers[0][0] = 1;
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.deepToString(numbers));
//        int[][][] arr = new int[2][3][5];
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(arr));
    }
}
