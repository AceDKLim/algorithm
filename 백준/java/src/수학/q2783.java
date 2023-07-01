package 수학;

import java.util.Scanner;

public class q2783 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float x = scan.nextFloat();
        x /= scan.nextFloat();
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            float a = scan.nextFloat();
            a /= scan.nextFloat();
            if (x > a) {
                x = a;
            }
        }
        System.out.printf("%.2f", x * 1000);
        scan.close();
    }
}
