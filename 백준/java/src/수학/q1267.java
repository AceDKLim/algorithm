package 수학;

import java.util.Scanner;

public class q1267 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int y = 0;
        int m = 0;
        for (int i = 0; i < n; i++) {
            int t = scan.nextInt();
            y += ((t / 30) + 1) * 10;
            m += ((t / 60) + 1) * 15;
        }
        scan.close();
        if (y <= m) {
            System.out.print("Y ");
        }
        if (m <= y) {
            System.out.print("M ");
        }
        System.out.println(Math.min(y, m));
    }
}
