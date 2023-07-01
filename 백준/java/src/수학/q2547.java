package 수학;

import java.math.BigInteger;
import java.util.Scanner;

public class q2547 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            scan.nextLine();
            BigInteger n = scan.nextBigInteger();
            BigInteger r = new BigInteger("0");
            for (int j = 0; j < n.intValue(); j++) {
                BigInteger k = scan.nextBigInteger();
                r = r.add(k);
            }
            r = r.mod(n);
            if (r.intValue() == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scan.close();
    }
}
