package 수학;

import java.util.Scanner;

public class q15781 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        long h = 0;
        long v = 0;
        for (int i = 0; i < n; i++) {
            h = Math.max(h, scan.nextLong());
        }
        for (int i = 0; i < m; i++) {
            v = Math.max(v, scan.nextLong());
        }
        System.out.println(h + v);
        scan.close();
    }
}
