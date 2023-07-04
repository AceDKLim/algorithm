package 수학;

import java.util.Scanner;

public class q9317 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            double d = scan.nextDouble();
            double rh = scan.nextDouble();
            double rv = scan.nextDouble();
            if (d == 0 && rh == 0 && rv == 0) {
                break;
            }
            double w = 16 * d / Math.sqrt(337);
            double h = w * 9 / 16;
            double dh = rh / w;
            double dv = rv / h;
            System.out.printf("Horizontal DPI: %.2f\n", dh);
            System.out.printf("Vertical DPI: %.2f\n", dv);
        }
        scan.close();
    }
}
