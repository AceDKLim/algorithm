package 기하학;

import java.util.Scanner;

public class q2121 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double a = scan.nextInt();
        double b = scan.nextInt();
        int coord[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                coord[i][j] = scan.nextInt();
            }
        }
        int a_cnt = 0;
        int b_cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double c = Math.sqrt(Math.pow(coord[i][0] - coord[j][0], 2) + Math.pow(coord[i][1] - coord[j][1], 2));
                if (c == a) {
                    a_cnt++;
                } else if (c == b) {
                    b_cnt++;
                }
            }
        }
        System.out.println(Math.min(a_cnt, b_cnt));
        scan.close();
    }
}
