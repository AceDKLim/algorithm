package 수학;

import java.util.Scanner;

public class q19572 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double d1 = scan.nextDouble();
        double d2 = scan.nextDouble();
        double d3 = scan.nextDouble();
        scan.close();
        double a = (d1 + d2 - d3) / 2;
        double b = d1 - a;
        double c = d2 - a;
        if (b + c == d3 && a > 0 && b > 0 && c > 0) {
            System.out.println(1);
            System.out.printf("%.1f %.1f %.1f", a, b, c);
        } else {
            System.out.println(-1);
        }
    }
}
