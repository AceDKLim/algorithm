package 기하학;

import java.util.Scanner;

public class q9166 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] coord = new int[n][2];
        double[][] distance = new double[n][n];
        for (int i = 0; i < n; i++) {
            coord[i][0] = scan.nextInt();
            coord[i][1] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                double x = Math.pow(coord[i][0] - coord[j][0], 2);
                double y = Math.pow(coord[i][1] - coord[j][1], 2);
                double d = Math.sqrt(x + y);
                distance[i][j] = d;
                distance[j][i] = d;
            }
        }

        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int c = scan.nextInt();
            int d = scan.nextInt();
            int result = 0;
            for (double j : distance[c - 1]) {
                if (j <= d) {
                    result++;
                }
            }
            System.out.println(result - 1);
        }
        scan.close();
    }
}
