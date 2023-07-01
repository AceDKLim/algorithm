package 수학;

import java.math.BigInteger;
import java.util.Scanner;

public class q5893 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger a = scan.nextBigInteger();
        scan.close();
        BigInteger b = new BigInteger(Integer.toBinaryString(17));
        a = a.multiply(b);
        String[] c = a.toString().split("");

        for (int i = c.length - 1; i > 0; i--) {
            while (Integer.parseInt(c[i]) > 1) {
                c[i - 1] = Integer.toString(Integer.parseInt(c[i - 1]) + 1);
                c[i] = Integer.toString(Integer.parseInt(c[i]) - 2);
            }
        }
        if (Integer.parseInt(c[0]) > 1) {
            c[0] = Integer.toString(Integer.parseInt(c[0]) - 2);
            System.out.print("1");
        }
        for (String i : c) {
            System.out.print(i);
        }
    }
}
