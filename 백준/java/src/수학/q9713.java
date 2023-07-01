package 수학;

import java.util.Scanner;

public class q9713 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int r = 0;
            for (int j = 1; j <= n; j++) {
                if (j % 2 == 1) {
                    r += j;
                }
            }
            System.out.println(r);
        }
        scan.close();
    }
}
