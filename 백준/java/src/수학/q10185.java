package 수학;

import java.util.Scanner;

public class q10185 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            double p = 1.0 / scan.nextDouble();
            double q = 1.0 / scan.nextDouble();
            double f = 1.0 / (p + q);
            System.out.printf("f = %.1f\n", f);
        }
        scan.close();
    }
}
