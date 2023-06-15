package 기하학;

import java.util.Scanner;

public class q17247 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int p[] = new int[4];
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int t = scan.nextInt();
                if (t == 1) {
                    p[c] = i;
                    c++;
                    p[c] = j;
                    c++;
                }
            }
        }
        int d = Math.abs(p[2] - p[0]) + Math.abs(p[3] - p[1]);
        System.out.println(d);
        scan.close();
    }
}
