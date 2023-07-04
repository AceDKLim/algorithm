package 그리디;

import java.util.Scanner;

public class q24239 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt() - 1;
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        int r = 0;
        if (c == Math.min(a, Math.min(b, c)) && n > 0) {
            r += Math.min(a, b);
            n--;
        }
        r += Math.min(a, Math.min(b, c)) * n;
        System.out.println(r / 100 + " " + r % 100);
    }
}
