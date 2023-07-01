package 수학;

import java.util.Scanner;

public class q12840 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int m = scan.nextInt();
        int s = scan.nextInt();
        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            int t = scan.nextInt();
            if (t == 1) {
                int r = scan.nextInt();
                int sr = r % 60;
                int mr = r / 60 % 60;
                int hr = r / 60 / 60;
                s += sr;
                m += mr;
                h += hr;
                if (s >= 60) {
                    m += s / 60;
                    s %= 60;
                }
                if (m >= 60) {
                    h += m / 60;
                    m %= 60;
                }
                h %= 24;
            }
            if (t == 2) {
                int r = scan.nextInt();
                int sr = r % 60;
                int mr = r / 60 % 60;
                int hr = r / 60 / 60;
                s -= sr;
                m -= mr;
                h -= hr;
                while (s < 0) {
                    s += 60;
                    m -= 1;
                }
                while (m < 0) {
                    m += 60;
                    h -= 1;
                }
                while (h < 0) {
                    h += 24;
                }
            }
            if (t == 3) {
                System.out.printf("%d %d %d\n", h, m, s);
            }
        }
        scan.close();
    }
}
