package 브루트포스;

import java.util.Scanner;

public class q9288 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = scan.nextInt();
            System.out.printf("Case %d:\n", i);
            for (int j = 1; j < 7; j++) {
                for (int k = j; k < 7; k++) {
                    if (j + k == n) {
                        System.out.printf("(%d,%d)\n", j, k);
                    }
                }
            }
        }
        scan.close();
    }
}