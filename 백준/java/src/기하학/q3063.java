package 기하학;

import java.util.Scanner;

public class q3063 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int x1 = scan.nextInt();
            int y1 = scan.nextInt();
            int x2 = scan.nextInt();
            int y2 = scan.nextInt();
            int x3 = scan.nextInt();
            int y3 = scan.nextInt();
            int x4 = scan.nextInt();
            int y4 = scan.nextInt();

            int r1 = x2 - x1;
            int c1 = y2 - y1;
            int w1 = r1 * c1;

            int r2 = 0;
            int c2 = 0;
            // 오른쪽 겹치는지 왼쪽 겹치는지 판단
            if (x2 > x3) {
                r2 = x2 - x3;
            } else {
                r2 = x4 - x1;
            }
            // 위쪽 겹치는지 아래쪽 겹치는지 판단
            if (y2 > y3) {
                c2 = y2 - y3;
            } else {
                c2 = y4 - y1;
            }
            int w2 = r2 * c2;
            System.out.println(r2);
            System.out.println(c2);
            System.out.println(w1 - w2);
        }
        scan.close();
    }
}
