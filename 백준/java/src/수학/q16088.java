package 수학;

import java.util.Scanner;

public class q16088 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int l = scan.nextInt();
            int r = scan.nextInt();
            int n = scan.nextInt();
            int m = scan.nextInt();
            int g = Math.abs(n - m);
            if (g == 0) {
                System.out.println("G");
            } else if (g > l && g <= r) {
                System.out.println("R");
            } else if (g > r && g <= l) {
                System.out.println("L");
            } else {
                System.out.println("E");
            }
        }
        scan.close();
    }
}