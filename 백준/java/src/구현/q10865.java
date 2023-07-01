package 구현;

import java.util.Scanner;

public class q10865 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] s = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            s[i] = 0;
        }
        for (int i = 0; i < m; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            s[a]++;
            s[b]++;
        }
        scan.close();
        for (int i = 1; i < n + 1; i++) {
            System.out.println(s[i]);
        }
    }
}
