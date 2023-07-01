package 수학;

import java.util.Scanner;

public class q18691 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int g = scan.nextInt();
            int c = scan.nextInt();
            int e = scan.nextInt();
            int r = Math.max(e - c, 0);
            if (g == 1) {
                System.out.println(r);
            } else if (g == 2) {
                System.out.println(r * 3);
            } else if (g == 3) {
                System.out.println(r * 5);
            }

        }
        scan.close();
    }
}
