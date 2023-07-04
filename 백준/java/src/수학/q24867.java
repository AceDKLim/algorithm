package 수학;

import java.util.Scanner;

public class q24867 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long k = scan.nextLong();
        long a = scan.nextLong();
        long x = scan.nextLong();
        long b = scan.nextLong();
        long y = scan.nextLong();
        scan.close();
        long e = k - a - b;
        System.out.println(Math.max((k - a) * x + e * y, (k - b) * y + e * x));
    }
}
