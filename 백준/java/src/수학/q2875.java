package 수학;

import java.util.Scanner;

public class q2875 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();
        scan.close();
        int t = Math.min(n / 2, m);
        n -= t * 2;
        m -= t;
        while (n + m < k) {
            t--;
            n += 3;
        }
        System.out.println(t);
    }
}
