package 수학;

import java.math.BigInteger;
import java.util.Scanner;

public class q6974 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            BigInteger a = scan.nextBigInteger();
            BigInteger b = scan.nextBigInteger();
            System.out.println(a.divide(b));
            System.out.println(a.mod(b));
            System.out.println();
        }
        scan.close();
    }
}
