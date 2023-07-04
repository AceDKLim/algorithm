package 구현;

import java.util.Arrays;
import java.util.Scanner;

public class q27334 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] s = new int[n][3];
        for (int i = 0; i < n; i++) {
            s[i][0] = scan.nextInt();
            s[i][1] = i;
        }
        scan.close();
        Arrays.sort(s, (a, b) -> {
            return a[0] - b[0];
        });
        int t = 0;
        s[0][2] = 1;
        for (int i = 1; i < n; i++) {
            if (s[i][0] == s[i - 1][0]) {
                t++;
            } else {
                t = 0;
            }
            s[i][2] = i + 1 - t;
        }
        Arrays.sort(s, (a, b) -> {
            return a[1] - b[1];
        });
        for (int i = 0; i < n; i++) {
            System.out.print(s[i][2]);
            System.out.println();
        }
    }
}
