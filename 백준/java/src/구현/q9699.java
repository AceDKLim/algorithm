package 구현;

import java.util.Scanner;

public class q9699 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 1; i <= t; i++) {
            int m = 0;
            for (int j = 0; j < 5; j++) {
                m = Math.max(m, scan.nextInt());
            }
            System.out.printf("Case #%d: %d\n", i, m);
        }
        scan.close();
    }
}
