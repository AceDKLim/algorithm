package 수학;

import java.util.Scanner;

public class q5074 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            String[] st = scan.next().split(":");
            String[] dt = scan.next().split(":");
            int h = Integer.parseInt(st[0]) + Integer.parseInt(dt[0]);
            int m = Integer.parseInt(st[1]) + Integer.parseInt(dt[1]);
            if (h == 0 && m == 0) {
                break;
            }
            if (m >= 60) {
                m -= 60;
                h += 1;
            }
            int d = 0;
            while (h >= 24) {
                h -= 24;
                d++;
            }
            if (d == 0) {
                System.out.printf("%02d:%02d\n", h, m);
            } else {
                System.out.printf("%02d:%02d +%d\n", h, m, d);
            }
        }
        scan.close();
    }
}
