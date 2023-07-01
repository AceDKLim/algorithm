package 기하학;

import java.util.Scanner;

public class q1002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int[] coords = new int[6];
            for (int j = 0; j < 6; j++) {
                coords[j] = scan.nextInt();
            }
            double x = Math.pow(coords[0] - coords[3], 2);
            double y = Math.pow(coords[1] - coords[4], 2);
            double d = Math.sqrt(x + y);

            int sr = coords[2] + coords[5];
            int mr = Math.abs(coords[2] - coords[5]);

            if (d == 0) {
                if (coords[2] == coords[5]) {
                    System.out.println(-1);
                } else {
                    System.out.println(0);
                }
            } else if (sr > d && mr < d) {
                System.out.println(2);
            } else if (sr == d || mr == d) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        scan.close();
    }
}
