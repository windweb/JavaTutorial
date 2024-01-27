import java.text.NumberFormat;

public class F013_FormattingNumbers {
    public static void main(String[] args) {
        // 0.1 или 10%
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println(result);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String result2 = percent.format(0.1);
        System.out.println(result2);
        // или 
        String result3 = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result3);
        
    }
}
