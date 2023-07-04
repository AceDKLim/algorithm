package 수학;

import java.util.Scanner;

public class q22061 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            if (c / 2 <= b) {
                if (c % 2 == 1) {
                    c = 1;
                } else {
                    c = 0;
                }
            } else {
                c -= 2 * b;
            }
            c -= a;
            if (c <= 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scan.close();
    }
}
