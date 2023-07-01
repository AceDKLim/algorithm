package 수학;

import java.math.BigInteger;
import java.util.Scanner;

public class q1247 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            long n = scan.nextLong();
            BigInteger r = new BigInteger("0");
            for (long j = 0; j < n; j++) {
                r = r.add(scan.nextBigInteger());
            }
            String t = r.toString();
            if (t.charAt(0) == '0') {
                System.out.println(0);
            } else if (t.charAt(0) == '-') {
                System.out.println("-");
            } else {
                System.out.println("+");
            }
        }
        scan.close();
    }
}
