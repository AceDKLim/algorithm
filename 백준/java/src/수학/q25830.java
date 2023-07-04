package 수학;

import java.util.Scanner;

public class q25830 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] t = scan.next().split(":");
        scan.close();
        int h = Integer.parseInt(t[0]);
        int m = Integer.parseInt(t[1]) - h;
        int s = 0 - Integer.parseInt(t[1]);
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
        System.out.printf("%02d:%02d:%02d\n", h, m, s);
    }
}
