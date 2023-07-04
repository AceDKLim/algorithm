package 브루트포스;

import java.util.Scanner;

public class q6856 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        scan.close();
        int r = 0;
        for (int i = 1; i <= n; i++) {
            if (10 - i <= m && 10 - i >= 1) {
                r++;
            }
        }
        if (r == 1) {
            System.out.println("There is 1 way to get the sum 10.");
        } else {
            System.out.println("There are " + r + " ways to get the sum 10.");
        }
    }
}
