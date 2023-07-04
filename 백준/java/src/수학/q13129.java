package 수학;

import java.util.Scanner;

public class q13129 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int n = scan.nextInt();
        scan.close();
        int r = b + a * n;
        for (int i = 0; i < n; i++) {
            System.out.print(r + " ");
            r += b;
        }
    }
}
