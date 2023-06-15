package 기하학;

import java.util.Arrays;
import java.util.Scanner;

public class q15821 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int r = scan.nextInt();
        double fishing[] = new double[n];
        for (int i = 0; i < n; i++) {
            int p = scan.nextInt();
            int coord[][] = new int[p][2];
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < 2; k++) {
                    coord[j][k] = scan.nextInt();
                }
            }
            double d = 0;
            for (int j = 0; j < p; j++) {
                double m = Math.pow(coord[j][0], 2) + Math.pow(coord[j][1], 2);
                if (m > d) {
                    d = m;
                }
            }
            fishing[i] = d;
        }
        Arrays.sort(fishing);
        int k = Math.min(n, r);
        System.out.println(Math.round(fishing[k - 1] * 100) / 100.0);
        scan.close();
    }
}
