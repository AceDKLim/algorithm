package 구현;

import java.math.BigInteger;
import java.util.Scanner;

public class q21057 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger a = scan.nextBigInteger();
        BigInteger b = scan.nextBigInteger();
        BigInteger c = scan.nextBigInteger();
        BigInteger d = scan.nextBigInteger();
        scan.close();
        BigInteger x = a.compareTo(b) == -1 ? a : b;
        BigInteger y = c.compareTo(d) == -1 ? c : d;
        BigInteger n = x.add(y);
        System.out.println(n.sqrt());
    }
}
