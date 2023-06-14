package 기하학;

import java.util.Scanner;

public class q13221 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int n = scan.nextInt();
        int rx = 0;
        int ry = 0;
        int rd = 2000;
        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int r = Math.abs(x - a) + Math.abs(y - b);
            if (r < rd) {
                rx = a;
                ry = b;
                rd = r;
            }
        }
        System.out.println(rx + " " + ry);
        scan.close();
    }
}
