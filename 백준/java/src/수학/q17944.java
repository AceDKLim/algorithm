package 수학;

import java.util.Scanner;

public class q17944 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int t = scan.nextInt();
        scan.close();
        int r = 0;
        int p = 0;
        for (int i = 0; i < t; i++) {
            if (p == 1) {
                r--;
            } else {
                r++;
            }
            if (r == 1) {
                p = 0;
            } else if (r == 2 * n) {
                p = 1;
            }
        }
        System.out.println(r);
    }
}
