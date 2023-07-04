package 수학;

import java.util.Scanner;

public class q14541 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int n = scan.nextInt();
            if (n == -1) {
                break;
            }
            int r = 0;
            int c = 0;
            for (int i = 0; i < n; i++) {
                int s = scan.nextInt();
                int t = scan.nextInt();
                r += s * (t - c);
                c = t;
            }
            System.out.println(r + " miles");
        }
        scan.close();
    }
}
