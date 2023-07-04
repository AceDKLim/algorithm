package 구현;

import java.util.Scanner;

public class q26432 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 1; i <= t; i++) {
            int m = scan.nextInt();
            int n = scan.nextInt();
            int p = scan.nextInt() - 1;
            int[][] s = new int[m][n];
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    s[j][k] = scan.nextInt();
                }
            }
            int r = 0;
            for (int j = 0; j < n; j++) {
                int c = 0;
                for (int k = 0; k < m; k++) {
                    c = Math.max(s[k][j], c);
                }
                r += c - s[p][j];
            }
            System.out.printf("Case #%d: %d\n", i, r);
        }
        scan.close();
    }
}
