package 수학;

import java.util.Scanner;

public class q26752 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int m = scan.nextInt();
        int s = scan.nextInt() + 1;
        scan.close();
        if (s == 60) {
            s -= 60;
            m += 1;
        }
        if (m == 60) {
            m -= 60;
            h += 1;
        }
        if (h == 24) {
            h -= 24;
        }
        System.out.printf("%02d:%02d:%02d\n", h, m, s);
    }
}
