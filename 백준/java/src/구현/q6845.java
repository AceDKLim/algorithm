package 구현;

import java.util.Scanner;

public class q6845 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int y = 2007 - scan.nextInt();
            int m = 2 - scan.nextInt();
            int d = 27 - scan.nextInt();
            if (d < 0) {
                d += 30;
                m--;
            }
            if (m < 0) {
                m += 12;
                y--;
            }
            if (y >= 18) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        scan.close();
    }
}
