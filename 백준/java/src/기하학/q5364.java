package 기하학;

import java.util.Scanner;

public class q5364 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] coords = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                coords[i][j] = scan.nextInt();
            }
        }
        int mx = 0;
        int my = 0;
        double mr = 999999999;
        for (int i = 1; i < n; i++) {
            double x = Math.pow(coords[0][0] - coords[i][0], 2);
            double y = Math.pow(coords[0][1] - coords[i][1], 2);
            double r = Math.sqrt(x + y);
            if (mr > r) {
                mx = coords[i][0];
                my = coords[i][1];
                mr = r;
            }
        }
        System.out.println(coords[0][0] + " " + coords[0][1]);
        System.out.println(mx + " " + my);
        System.out.println(Math.round(mr * 100) / 100.0);
        scan.close();
    }
}
