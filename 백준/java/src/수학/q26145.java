package 수학;

import java.util.Scanner;

public class q26145 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] r = new int[n + m];
        for (int i = 0; i < n; i++) {
            r[i] = scan.nextInt();
        }
        for (int i = n; i < n + m; i++) {
            r[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + m; j++) {
                int t = scan.nextInt();
                r[i] -= t;
                r[j] += t;
            }
        }
        scan.close();
        for (int i : r) {
            System.out.print(i + " ");
        }
    }
}
