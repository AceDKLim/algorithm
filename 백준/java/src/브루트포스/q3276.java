package 브루트포스;

import java.util.Scanner;

public class q3276 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int a = 10000;
        int b = 10000;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                if (i * j >= n && a + b > i + j) {
                    a = i;
                    b = j;
                }
            }
        }
        System.out.println(a + " " + b);
    }
}
