package 기하학;

import java.util.Scanner;

public class q10540 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int min_x = 100;
        int min_y = 100;
        int max_x = 1;
        int max_y = 1;
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            min_x = Math.min(min_x, x);
            min_y = Math.min(min_y, y);
            max_x = Math.max(max_x, x);
            max_y = Math.max(max_y, y);
        }
        int xg = max_x - min_x;
        int yg = max_y - min_y;
        int m = Math.max(xg, yg);
        System.out.println(m * m);
        scan.close();
    }
}
