package 기하학;

import java.util.Arrays;
import java.util.Scanner;

public class q13552 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double[] distance = new double[n];
        for (int i = 0; i < n; i++) {
            double x = Math.pow(scan.nextInt(), 2);
            double y = Math.pow(scan.nextInt(), 2);
            double z = Math.pow(scan.nextInt(), 2);
            distance[i] = Math.sqrt(x + y + z);
        }
        Arrays.sort(distance);
        int m = scan.nextInt();
        for (int i = 0; i < m; i++) {
            double x = Math.pow(scan.nextInt(), 2);
            double y = Math.pow(scan.nextInt(), 2);
            double z = Math.pow(scan.nextInt(), 2);
            int d = scan.nextInt();
            double r = Math.sqrt(x + y + z);
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (d >= Math.abs(r - distance[j])) {
                    cnt++;
                } else {
                    break;
                }
            }
            System.out.println(cnt);
        }
        scan.close();
    }
}
