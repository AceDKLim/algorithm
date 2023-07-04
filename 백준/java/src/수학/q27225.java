package 수학;

import java.util.Scanner;

public class q27225 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        scan.close();
        int s = m + n;
        int r = 0;
        if (s % 2 == 1) {
            if (n > m) {
                n--;
                r++;
            } else {
                m--;
                r++;
            }
        }
        r += Math.min(n, m) * 2;
        System.out.println(r);
    }
}
