package 수학;

import java.util.Scanner;

public class q3029 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] st = scan.next().split(":");
        String[] et = scan.next().split(":");
        scan.close();
        int h = Integer.parseInt(et[0]) - Integer.parseInt(st[0]);
        int m = Integer.parseInt(et[1]) - Integer.parseInt(st[1]);
        int s = Integer.parseInt(et[2]) - Integer.parseInt(st[2]);
        if (s < 0) {
            s += 60;
            m--;
        }
        if (m < 0) {
            m += 60;
            h--;
        }
        if (h < 0) {
            h += 24;
        }
        if (h == 0 && m == 0 && s == 0) {
            h += 24;
        }
        System.out.printf("%02d:%02d:%02d", h, m, s);
    }
}
