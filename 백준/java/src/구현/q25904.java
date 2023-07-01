package 구현;

import java.util.Scanner;

public class q25904 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = scan.nextInt();
        }
        scan.close();
        int r = 0;
        while (r == 0) {
            for (int i = 0; i < n; i++) {
                if (p[i] < x) {
                    r = i + 1;
                    break;
                }
                x++;
            }
        }
        System.out.println(r);
    }
}
