package 수학;

import java.math.BigInteger;
import java.util.Scanner;

public class q6378 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            String[] n = scan.next().split("");
            if (n[0].equals("0")) {
                break;
            }
            while (n.length != 1) {
                BigInteger r = new BigInteger("0");
                for (int i = 0; i < n.length; i++) {
                    BigInteger k = new BigInteger(n[i]);
                    r = r.add(k);
                }
                n = r.toString().split("");
            }
            System.out.println(n[0]);
        }
        scan.close();
    }
}
