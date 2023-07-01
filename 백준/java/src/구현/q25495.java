package 구현;

import java.util.Scanner;

public class q25495 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int b = 100;
        int c = 0;
        int m = 0;
        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();
            if (a == m && c != 0) {
                c *= 2;
            } else {
                c = 2;
            }
            b -= c;
            m = a;
            if (b <= 0) {
                b = 100;
                c = 0;
            }
        }
        System.out.println(100 - b);
        scan.close();
    }
}
