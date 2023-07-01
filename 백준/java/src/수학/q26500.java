package 수학;

import java.util.Scanner;

public class q26500 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            double r = Math.abs(a - b);
            System.out.printf("%.1f\n", r);
        }
        scan.close();
    }
}
