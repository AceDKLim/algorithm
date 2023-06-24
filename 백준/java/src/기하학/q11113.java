package 기하학;

import java.util.Scanner;

public class q11113 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double[][] coords = new double[n][2];
        for (int i = 0; i < n; i++) {
            coords[i][0] = scan.nextDouble();
            coords[i][1] = scan.nextDouble();
        }

        int p = scan.nextInt();
        for (int i = 0; i < p; i++) {
            int k = scan.nextInt();
            int[] track = new int[k];
            for (int j = 0; j < k; j++) {
                track[j] = scan.nextInt();
            }
            double result = 0;
            for (int j = 0; j < k - 1; j++) {
                double x = Math.pow(coords[track[j]][0] - coords[track[j + 1]][0], 2);
                double y = Math.pow(coords[track[j]][1] - coords[track[j + 1]][1], 2);
                result += Math.sqrt(x + y);
            }
            System.out.println(Math.round(result));
        }
        scan.close();
    }
}
