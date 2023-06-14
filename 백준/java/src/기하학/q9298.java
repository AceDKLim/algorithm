package 기하학;

import java.util.Scanner;

public class q9298 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 1; i < t + 1; i++) {
            int n = scan.nextInt();
            double max_x = -1001;
            double max_y = -1001;
            double min_x = 1001;
            double min_y = 1001;
            for (int j = 0; j < n; j++) {
                double x = scan.nextDouble();
                double y = scan.nextDouble();
                max_x = Math.max(max_x, x);
                max_y = Math.max(max_y, y);
                min_x = Math.min(min_x, x);
                min_y = Math.min(min_y, y);
            }
            double x = max_x - min_x;
            double y = max_y - min_y;
            System.out.println("Case " + i + ": Area " + (x * y) + ", Perimeter " + (2 * x + 2 * y));
        }
        scan.close();
    }
}
