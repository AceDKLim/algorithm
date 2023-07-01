package 수학;

import java.util.Scanner;

public class q25704 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int p = scan.nextInt();
        int r = p;
        if (n >= 20) {
            r = (int) Math.min(p * 0.75, r);
        }
        if (n >= 15) {
            r = Math.min(p - 2000, r);
        }
        if (n >= 10) {
            r = (int) Math.min(p * 0.9, r);
        }
        if (n >= 5) {
            r = Math.min(p - 500, r);
        }
        if (r < 0) {
            r = 0;
        }
        System.out.println(r);
        scan.close();
    }
}