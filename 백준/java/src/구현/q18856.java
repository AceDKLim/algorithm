package 구현;

import java.util.Scanner;

public class q18856 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int p = 0;
        int m = n;
        while (true) {
            int c = 0;
            for (int i = 2; i < Math.round(Math.sqrt(m)) + 1; i++) {
                if (m % i == 0) {
                    c = 1;
                    break;
                }
            }
            if (c == 0) {
                p = m;
                break;
            }
            m++;
        }
        System.out.println(n);
        for (int i = 1; i <= n; i++) {
            if (i == n) {
                System.out.println(p);
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
