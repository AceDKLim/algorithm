package 수학;

import java.util.Scanner;

public class q13073 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int r = 0;
            int o = 0;
            int e = 0;
            for (int j = 1; j <= n; j++) {
                r += j;
            }
            for (int j = 1; j <= 2 * n; j += 2) {
                o += j;
            }
            for (int j = 2; j <= 2 * n; j += 2) {
                e += j;
            }
            System.out.printf("%d %d %d\n", r, o, e);
        }
        scan.close();
    }
}
