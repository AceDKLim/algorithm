package 수학;

import java.math.BigInteger;
import java.util.Scanner;

public class q27246 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger n = scan.nextBigInteger();
        scan.close();
        BigInteger r = BigInteger.ZERO;
        BigInteger c = BigInteger.ZERO;
        BigInteger i = BigInteger.ONE;
        while (r.compareTo(n) <= 0) {
            r = r.add(i.multiply(i));
            c = c.add(BigInteger.ONE);
            i = i.add(BigInteger.ONE);
        }
        System.out.println(c.subtract(BigInteger.ONE));
    }
}
