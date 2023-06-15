package 기하학;

import java.util.Scanner;

public class q8716 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        int x3 = scan.nextInt();
        int y3 = scan.nextInt();
        int x4 = scan.nextInt();
        int y4 = scan.nextInt();
        int rx = Math.max(x1, x2);
        int ry = Math.max(y1, y2);
        int lx = Math.min(x3, x4);
        int ly = Math.min(y3, y4);
        int r = Math.abs(rx - lx);
        int l = Math.abs(ry - ly);
        System.out.println(r * l);
        scan.close();
    }
}
