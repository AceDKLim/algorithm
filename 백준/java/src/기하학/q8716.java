package 기하학;

import java.util.Scanner;

public class q8716 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long x1 = scan.nextLong();
        long y1 = scan.nextLong();
        long x2 = scan.nextLong();
        long y2 = scan.nextLong();
        long x3 = scan.nextLong();
        long y3 = scan.nextLong();
        long x4 = scan.nextLong();
        long y4 = scan.nextLong();
        long r = 0;
        long l = 0;
        if (x2 < x3 || x4 < x1) {
            r = 0;
        } else if (x1 > x3) {
            if (x4 > x2) {
                r = x2 - x1;
            } else {
                r = x4 - x1;
            }
        } else {
            if (x4 < x2) {
                r = x4 - x3;
            } else {
                r = x2 - x3;
            }
        }

        if (y1 < y4 || y3 < y2) {
            l = 0;
        } else if (y1 > y3) {
            if (y4 > y2) {
                l = y3 - y4;
            } else {
                l = y3 - y2;
            }
        } else {
            if (y2 > y4) {
                l = y1 - y2;
            } else {
                l = y1 - y4;
            }
        }
        System.out.println(r * l);
        scan.close();
    }
}
