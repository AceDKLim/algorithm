package 수학;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class q15858 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigDecimal a = scan.nextBigDecimal();
        BigDecimal b = scan.nextBigDecimal();
        BigDecimal c = scan.nextBigDecimal();
        scan.close();
        System.out.println(a.multiply(b).divide(c, MathContext.DECIMAL128));
    }
}
