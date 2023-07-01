package 수학;

import java.util.Scanner;

public class q9782 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = 1;
        while (true) {
            int n = scan.nextInt();
            if (n == 0) {
                break;
            }
            double r = 0;

            for (int i = 1; i <= n; i++) {
                int t = scan.nextInt();
                if (n % 2 == 1) {
                    if (i == n / 2 + 1) {
                        r = t;
                    }
                } else {
                    if (i == (n / 2) || i == (n / 2 + 1)) {
                        r += (double) t / 2;
                    }
                }
            }
            System.out.println(String.format("Case %d: %.1f", cnt, r));
            cnt++;
        }
        scan.close();
    }
}
