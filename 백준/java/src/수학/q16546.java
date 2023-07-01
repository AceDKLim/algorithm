package 수학;

import java.util.Scanner;

public class q16546 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int r = 0;
        for (int i = 1; i <= n; i++) {
            r += i;
        }
        for (int i = 0; i < n - 1; i++) {
            r -= scan.nextInt();
        }
        System.out.println(r);
        scan.close();
    }
}
