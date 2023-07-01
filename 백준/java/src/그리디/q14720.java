package 그리디;

import java.util.Scanner;

public class q14720 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = scan.nextInt();
        }
        scan.close();
        int r = 0;
        int p = 0;
        for (int i = 0; i < n; i++) {
            if (s[i] == p) {
                r++;
                p = p == 2 ? 0 : p + 1;
            }
        }
        System.out.println(r);
    }
}
