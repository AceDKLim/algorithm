package 구현;

import java.util.Scanner;

public class q5523 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = 0;
        int b = 0;
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (x > y) {
                a++;
            } else if (x < y) {
                b++;
            }
        }
        System.out.printf("%d %d", a, b);
        scan.close();
    }
}
