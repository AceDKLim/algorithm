package 수학;

import java.util.Scanner;

public class q15780 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int r = 0;
        for (int i = 0; i < k; i++) {
            int t = scan.nextInt();
            int m = t % 2 == 0 ? t / 2 : t / 2 + 1;
            r += m;
        }
        scan.close();
        if (r < n) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
