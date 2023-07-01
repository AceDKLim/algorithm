package 수학;

import java.util.Scanner;

public class q4435 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] g = { 1, 2, 3, 3, 4, 10 };
        int[] s = { 1, 2, 2, 2, 3, 5, 10 };
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int gs = 0;
            int ss = 0;
            for (int j = 0; j < 6; j++) {
                gs += scan.nextInt() * g[j];
            }
            for (int j = 0; j < 7; j++) {
                ss += scan.nextInt() * s[j];
            }
            if (gs > ss) {
                System.out.printf("Battle %d: Good triumphs over Evil\n", i + 1);
            } else if (gs < ss) {
                System.out.printf("Battle %d: Evil eradicates all trace of Good\n", i + 1);
            } else {
                System.out.printf("Battle %d: No victor on this battle field\n", i + 1);
            }
        }
        scan.close();
    }
}
