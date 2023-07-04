package 수학;

import java.util.Scanner;

public class q26550 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long t = scan.nextLong();
        for (long i = 0; i < t; i++) {
            long n = scan.nextLong();
            long l = 0;
            long r = 0;
            for (long j = 1; j <= n; j++) {
                l += j;
                r += l;
            }
            System.out.println(r);
        }
        scan.close();
    }
}
