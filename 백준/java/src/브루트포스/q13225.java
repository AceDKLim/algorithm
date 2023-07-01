package 브루트포스;

import java.util.Scanner;

public class q13225 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c = scan.nextInt();
        for (int i = 0; i < c; i++) {
            int n = scan.nextInt();
            int r = 0;
            for (int j = 1; j <= n; j++) {
                if (n % j == 0) {
                    r++;
                }
            }
            System.out.println(n + " " + r);
        }
        scan.close();
    }
}
