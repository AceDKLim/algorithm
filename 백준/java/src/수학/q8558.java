package 수학;

import java.util.Scanner;

public class q8558 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        scan.close();
        int r = 1;
        for (int i = 1; i <= n; i++) {
            r *= i;
            r %= 10;
        }
        System.out.println(r);
    }
}
