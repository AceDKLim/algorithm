package 브루트포스;

import java.util.Scanner;

public class q4619 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int b = scan.nextInt();
            int n = scan.nextInt();
            if (b == 0 && n == 0) {
                break;
            }
            int a = 0;
            while (Math.pow(a, n) < b) {
                a++;
            }
            int x = (int) Math.pow(a, n);
            int y = (int) Math.pow(a - 1, n);
            int r = Math.abs(b - x) > Math.abs(b - y) ? a - 1 : a;
            System.out.println(r);
        }
        scan.close();
    }
}
