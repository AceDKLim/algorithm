package 수학;

import java.util.Scanner;

public class q14545 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int r = 0;
            for (int j = 1; j <= n; j++) {
                r += j * j;
            }
            System.out.println(r);
        }
        scan.close();
    }
}
