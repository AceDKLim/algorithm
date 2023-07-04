package 구현;

import java.util.Scanner;

public class q5246 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int[] l = new int[9];
            int[] h = new int[9];
            for (int j = 0; j < n; j++) {
                int x = scan.nextInt();
                int y = scan.nextInt();
                l[x]++;
                h[y]++;
            }
            int r = 0;
            for (int j = 0; j < 9; j++) {
                r = Math.max(r, l[j]);
                r = Math.max(r, h[j]);
            }
            System.out.println(r);
        }
        scan.close();
    }
}
