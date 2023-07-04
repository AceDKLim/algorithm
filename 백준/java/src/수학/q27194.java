package 수학;

import java.util.Scanner;

public class q27194 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long t = scan.nextLong();
        long m = scan.nextLong();
        long x = scan.nextLong();
        long y = scan.nextLong();
        scan.close();
        double r = Math.abs((double) m / x + (double) (n - m) / y);
        r = Math.ceil(r / 60);
        System.out.println(Math.max((int) r - t, 0));
    }
}
