package 수학;

import java.util.Scanner;

public class q5361 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] cost = { 350.34, 230.90, 190.55, 125.30, 180.90 };
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            double r = 0;
            for (int j = 0; j < 5; j++) {
                r += cost[j] * scan.nextInt();
            }
            System.out.printf("$%.2f\n", r);
        }
        scan.close();
    }
}
