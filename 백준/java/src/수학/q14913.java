package 수학;

import java.util.Scanner;

public class q14913 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long d = scan.nextLong();
        long k = scan.nextLong();
        scan.close();
        long n = 0;
        long c = 1000000;
        while (true) {
            a += d;
            n++;
            if (Math.abs(k - a) < c) {
                c = Math.abs(k - a);
            } else {
                a -= d;
                break;
            }
        }
        if (a == k) {
            System.out.println(n);
        } else {
            System.out.println("X");
        }
    }
}
