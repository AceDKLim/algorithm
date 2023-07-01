package 수학;

import java.util.Scanner;

public class q11312 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            long a = scan.nextLong();
            a /= scan.nextInt();
            a -= 1;
            long r = -a - 1;
            for (long j = a + 1; j > 0; j--) {
                r += 2 * j;
            }
            System.out.println(r);
        }
        scan.close();
    }
}
