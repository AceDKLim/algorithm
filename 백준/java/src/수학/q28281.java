package 수학;

import java.util.Scanner;

public class q28281 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        int r = 2000000;
        int t = scan.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int p = scan.nextInt();
            r = Math.min(r, t + p);
            t = p;
        }
        scan.close();
        System.out.println(r * x);
    }
}
