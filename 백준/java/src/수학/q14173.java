package 수학;

import java.util.Scanner;

public class q14173 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        x1 = Math.min(x1, scan.nextInt());
        y1 = Math.min(y1, scan.nextInt());
        x2 = Math.max(x2, scan.nextInt());
        y2 = Math.max(y2, scan.nextInt());
        scan.close();
        int r = Math.max(x2 - x1, y2 - y1);
        System.out.println(r * r);
    }
}
