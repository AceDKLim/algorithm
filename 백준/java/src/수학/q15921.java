package 수학;

import java.util.Scanner;

public class q15921 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n != 0) {
            float r1 = 0;
            float r2 = 0;
            for (int i = 0; i < n; i++) {
                float t = scan.nextFloat();
                r1 += t;
                r2 += t / n;
            }
            r1 /= n;
            System.out.printf("%.2f", r1 / r2);
        } else {
            System.out.println("divide by zero");
        }
        scan.close();
    }
}
