package 구현;

import java.util.Scanner;

public class q20282 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = 100;
        int c = 100;
        for (int i = 0; i < n; i++) {
            c += scan.nextInt();
            m = Math.max(c, m);
        }
        System.out.println(m);
        scan.close();
    }
}
