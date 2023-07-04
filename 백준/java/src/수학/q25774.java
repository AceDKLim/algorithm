package 수학;

import java.util.Scanner;

public class q25774 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        int m = scan.nextInt();
        int y = scan.nextInt();
        int n = scan.nextInt();
        d = scan.nextInt() - d;
        m = scan.nextInt() - m;
        y = scan.nextInt() - y;
        scan.close();
        while (y > 0) {
            y -= 1;
            m += 12;
        }
        while (m > 0) {
            m--;
            d += 30;
        }
        n += d;
        n = n % 7 == 0 ? 7 : n % 7;
        System.out.println(n);
    }
}
