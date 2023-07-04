package 구현;

import java.util.Scanner;

public class q19963 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();
        int[] s = new int[n + 1];
        for (int i = 0; i < m + k; i++) {
            s[scan.nextInt()] = 1;
        }
        scan.close();
        System.out.println(n - m - k);
        for (int i = 1; i <= n; i++) {
            if (s[i] != 1) {
                System.out.print(i + " ");
            }
        }
    }
}
