import java.math.BigDecimal;

public class Homework2_1 {
    public static void main(String[] args) {

        BigDecimal x = new BigDecimal(400);
        BigDecimal y = new BigDecimal(5);
        BigDecimal result = y.divide(new BigDecimal(100)).multiply(x);
        System.out.println(result);
    }
}
