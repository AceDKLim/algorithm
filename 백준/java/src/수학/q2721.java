package 수학;

import java.util.Scanner;

public class q2721 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int w = 0;
            for (int j = 1; j <= n; j++) {
                int p = 0;
                for (int k = 1; k <= j + 1; k++) {
                    p += k;
                }
                w += p * j;
            }
            System.out.println(w);
        }
        scan.close();
    }
}
