package 수학;

import java.math.BigInteger;
import java.util.Scanner;

public class q27130 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger a = scan.nextBigInteger();
        String b = scan.next();
        scan.close();
        System.out.println(a);
        System.out.println(b);
        for (int i = b.length() - 1; i >= 0; i--) {
            System.out.println(a.multiply(new BigInteger(Character.toString(b.charAt(i)))));
        }
        System.out.println(a.multiply(new BigInteger(b)));
    }
}
