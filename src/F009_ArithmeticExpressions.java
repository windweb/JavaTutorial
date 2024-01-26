public class F009_ArithmeticExpressions {
    public static void main(String[] args) {
        int result1 = 10 / 3;
        System.out.println(result1); // result = 3

        double result2 = (double) 10 / (double) 3;
        System.out.println(result2); // result2 = 3.3333333333333335

        int x = 1;
        x++; // x = x + 1
//        ++x; // x = x + 1
        System.out.println(x); // x = 2

        int y = x++;
        System.out.println(y);

        // ++x; отличается от x++;
        // переменная x не увеличивается, а просто увеличивается

        int z = 10;
        System.out.println(z);
        int w = ++z;
        System.out.println(z);
        int t = z++;
        System.out.println(z);

        System.out.println(w);
        System.out.println(t);

    }
}
