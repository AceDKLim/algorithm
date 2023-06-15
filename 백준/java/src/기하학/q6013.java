package 기하학;

import java.util.Scanner;

public class q6013 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int r[][] = new int[t][2];
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < 2; j++) {
                r[i][j] = scan.nextInt();
            }
        }

        int r1 = 0;
        int r2 = 0;
        double n = 0;
        for (int i = 0; i < t; i++) {
            for (int j = i + 1; j < t; j++) {
                if (Math.pow(r[i][0] - r[j][0], 2) + Math.pow(r[i][1] - r[j][1], 2) > n) {
                    r1 = i + 1;
                    r2 = j + 1;
                    n = Math.pow(r[i][0] - r[j][0], 2) + Math.pow(r[i][1] - r[j][1], 2);
                }
            }
        }
        System.out.println(r1 + " " + r2);
        scan.close();
    }
}
