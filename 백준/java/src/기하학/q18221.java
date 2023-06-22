package 기하학;

import java.util.Scanner;

public class q18221 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int seat[][] = new int[n][n];
        int tx = 0;
        int ty = 0;
        int sx = 0;
        int sy = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                seat[i][j] = scan.nextInt();
                if (seat[i][j] == 5) {
                    tx = i;
                    ty = j;
                } else if (seat[i][j] == 2) {
                    sx = i;
                    sy = j;
                }
            }
        }
        double d = Math.sqrt(Math.pow(tx - sx, 2) + Math.pow(ty - sy, 2));
        int cnt = 0;
        if (sx - tx < 0 || sx - tx < 0) {
            int cx = tx;
            int cy = ty;
            tx = sx;
            tx = sy;
            sx = cx;
            sy = cy;
        }
        for (int i = tx; i <= sx; i++) {
            for (int j = ty; j <= sy; j++) {
                if (seat[i][j] == 1) {
                    cnt++;
                }
            }
        }
        if (d >= 5 && cnt >= 3) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        scan.close();
    }
}
