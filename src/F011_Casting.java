public class F011_Casting {
    public static void main(String[] args) {
        // implicit casting
        // byte < short < int < long < float < double
        short x = 1;
        int y = x + 2;
        System.out.println(y);

        double a = 1.1;
        double b = a + 2; // 1.1 + 2.0
        System.out.println(b); // 3.1

        double c = 1.1;
        int d = (int) c + 2; // 1 + 2
        System.out.println(d); // 3

        String e = "1";
        int f = Integer.parseInt(e) + 2;

        /*
        Integer.parseInt(); // convert String to int
        Short.parseShort(); // convert String to short
        Long.parseLong(); // convert String to long
        Double.parseDouble(); // convert String to double
        Float.parseFloat(); // convert String to float
        Byte.parseByte(); // convert String to byte
        */

        System.out.println(f);

    }
}
