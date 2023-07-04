package 수학;

import java.util.Scanner;

public class q9493 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            double n = scan.nextDouble();
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            if (n == 0 && a == 0 && b == 0) {
                break;
            }
            int s = (int) Math.round((n / a - n / b) * 3600);
            int m = s / 60;
            s %= 60;
            int h = m / 60;
            m %= 60;
            System.out.printf("%d:%02d:%02d\n", h, m, s);
        }
        scan.close();
    }
}