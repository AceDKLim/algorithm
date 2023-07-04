package 수학;

import java.util.Scanner;

public class q4909 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            double r = 0;
            double mi = 10;
            double ma = 0;
            for (int i = 0; i < 6; i++) {
                Double n = scan.nextDouble();
                mi = Math.min(mi, n);
                ma = Math.max(ma, n);
                r += n;
            }
            if (r == 0) {
                break;
            }
            r -= mi;
            r -= ma;
            if ((int) r / 4 == r / 4) {
                System.out.println((int) r / 4);
            } else {
                System.out.println(r / 4);
            }
        }
        scan.close();
    }
}
