package 수학;

import java.util.Scanner;

public class q26561 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        for (long i = 0; i < n; i++) {
            long p = scan.nextLong();
            long t = scan.nextLong();
            p -= (t / 7);
            p += (t / 4);
            System.out.println(p);
        }
        scan.close();
    }
}
