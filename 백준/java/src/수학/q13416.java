package 수학;

import java.util.Scanner;

public class q13416 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int r = 0;
            for (int j = 0; j < n; j++) {
                int m = 0;
                for (int k = 0; k < 3; k++) {
                    m = Math.max(m, scan.nextInt());
                }
                r += m;
            }
            System.out.println(r);
        }
        scan.close();
    }
}
