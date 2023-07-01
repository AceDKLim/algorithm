package 수학;

import java.util.Scanner;

public class q16785 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        int n = 0;
        while (c > 0) {
            int r = c % a == 0 ? c / a : c / a + 1;
            if (r <= 7) {
                n += r;
                break;
            } else {
                n += 7;
                c -= (a * 7) + b;
            }
        }
        System.out.println(n);
    }
}
