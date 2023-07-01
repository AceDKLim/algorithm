package 수학;

import java.util.Scanner;

public class q25965 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            long[][] kda = new long[n][3];
            for (int j = 0; j < n; j++) {
                for (int p = 0; p < 3; p++) {
                    kda[j][p] = scan.nextLong();
                }
            }
            long r = 0;
            long k = scan.nextLong();
            long d = scan.nextLong();
            long a = scan.nextLong();
            for (int j = 0; j < n; j++) {
                long q = kda[j][0] * k - kda[j][1] * d + kda[j][2] * a;
                if (q > 0) {
                    r += q;
                }
            }
            System.out.println(r);
        }
        scan.close();
    }
}
