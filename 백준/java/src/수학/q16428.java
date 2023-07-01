package 수학;

import java.math.BigInteger;
import java.util.Scanner;

public class q16428 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger a = scan.nextBigInteger();
        BigInteger b = scan.nextBigInteger();
        scan.close();
        if (a.toString().charAt(0) == '-') {
            if (b.toString().charAt(0) == '-') {
                a = a.multiply(new BigInteger("-1"));
                b = b.multiply(new BigInteger("-1"));
                System.out.println(a.divide(b).add(new BigInteger("1")));
                System.out.println(a.mod(b).add(new BigInteger("1")));
            } else {
                a = a.multiply(new BigInteger("-1"));
                System.out.println(a.divide(b).add(new BigInteger("1").multiply(new BigInteger("-1"))));
                System.out.println(a.mod(b).add(new BigInteger("1")));
            }
        } else if (b.toString().charAt(0) == '-') {
            b = b.multiply(new BigInteger("-1"));
            System.out.println(a.divide(b).multiply(new BigInteger("-1")));
            System.out.println(a.mod(b));
        } else {
            System.out.println(a.divide(b));
            System.out.println(a.mod(b));
        }
    }
}
