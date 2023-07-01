package 수학;

import java.util.Scanner;

public class q13223 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] nt = scan.next().split(":");
        String[] rt = scan.next().split(":");
        scan.close();
        int h = Integer.parseInt(rt[0]) - Integer.parseInt(nt[0]);
        int m = Integer.parseInt(rt[1]) - Integer.parseInt(nt[1]);
        int s = Integer.parseInt(rt[2]) - Integer.parseInt(nt[2]);
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
        if (s == 0 && m == 0 && h == 0) {
            h = 24;
        }
        System.out.printf("%02d:%02d:%02d", h, m, s);
    }
}
