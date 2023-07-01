package 수학;

import java.util.Scanner;

public class q7523 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 1; i <= t; i++) {
            System.out.printf("Scenario #%d:\n", i);
            long n = scan.nextLong() - 1;
            long m = scan.nextLong();
            long a = n * (n + 1) / 2;
            long b = m * (m + 1) / 2;
            System.out.println(b - a);
            System.out.println();
        }
        scan.close();
    }
}
