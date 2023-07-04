package 수학;

import java.util.Scanner;

public class q9299 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = scan.nextInt();
            int[] s = new int[n + 1];
            for (int j = 0; j <= n; j++) {
                s[j] = scan.nextInt();
            }
            for (int j = 0; j < n; j++) {
                s[j] = (n - j) * s[j];
            }
            System.out.printf("Case %d: %d", i, n - 1);
            for (int j = 0; j < n; j++) {
                System.out.print(" " + s[j]);
            }
            System.out.println();
        }
        scan.close();
    }
}
