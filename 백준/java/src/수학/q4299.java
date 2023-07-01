package 수학;

import java.util.Scanner;

public class q4299 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int m = scan.nextInt();
        int a = -1;
        int b = -1;
        for (int i = 0; i < s / 2 + 1; i++) {
            int x = s - i;
            if (x < i) {
                continue;
            }
            if (x - i == m) {
                a = x;
                b = i;
                System.out.println(String.format("%d %d", a, b));
            }
        }
        if (a == b && a == -1) {
            System.out.println(-1);
        }
        scan.close();
    }
}
