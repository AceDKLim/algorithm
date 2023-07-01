package 수학;

import java.util.Scanner;

public class q15734 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int r = scan.nextInt();
        int a = scan.nextInt();
        scan.close();
        if (l > r) {
            int t = l;
            l = r;
            r = t;
        }
        if (r - l >= a) {
            l += a;
            a = 0;
        } else {
            int t = r - l;
            a -= t;
            l += t + a / 2;
            r += a / 2;
        }
        System.out.println(2 * Math.min(l, r));
    }
}
