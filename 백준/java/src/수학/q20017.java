package 수학;

import java.util.Scanner;

public class q20017 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int a = scan.nextInt();
        int c = 0;
        int[][] cat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cat[i][j] = scan.nextInt();
            }
        }
        scan.close();
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (cat[i - 1][j] * 2 < cat[i][j]) {
                    c++;
                }
            }
        }
        System.out.println(c * a);
    }
}
