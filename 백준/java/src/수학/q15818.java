package 수학;

import java.util.Scanner;

public class q15818 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextInt();
        long m = scan.nextInt();
        long r = 1;
        for (long i = 0; i < n; i++) {
            long c = scan.nextInt();
            c %= m;
            r *= c;
            r %= m;
        }
        System.out.println(r);
        scan.close();
    }
}
