package 수학;

import java.util.Scanner;

public class q15083 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double p1 = 0;
        double p3 = 1000;
        double s = 0;
        for (int i = 0; i < 3; i++) {
            double n = scan.nextDouble();
            s += n;
            p1 = Math.max(p1, n);
            p3 = Math.min(p3, n);
        }
        double p2 = s - p1 - p3;
        double s1 = s * (100.0 - scan.nextDouble()) / 100;
        int c1 = scan.nextInt();
        int c2 = scan.nextInt();
        scan.close();
        if (c1 < c2) {
            int t = c1;
            c1 = c2;
            c2 = t;
        }
        p1 *= (100.0 - c1) / 100;
        p2 *= (100.0 - c2) / 100;
        double s2 = p1 + p2 + p3;
        if (s - s1 > s - s2) {
            System.out.printf("one %.2f\n", s - s1);
        } else {
            System.out.printf("two %.2f\n", s - s2);
        }
    }
}
