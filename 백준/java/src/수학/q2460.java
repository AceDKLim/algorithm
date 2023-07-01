package 수학;

import java.util.Scanner;

public class q2460 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = 0;
        int n = 0;
        for (int i = 0; i < 10; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            n -= a;
            n += b;
            if (n > m) {
                m = n;
            }
        }
        scan.close();
        System.out.println(m);
    }
}
