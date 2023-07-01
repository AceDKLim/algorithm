package 수학;

import java.util.Scanner;

public class q9550 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int r = 0;
            for (int j = 0; j < n; j++) {
                r += scan.nextInt() / k;
            }
            System.out.println(r);
        }
        scan.close();
    }
}
