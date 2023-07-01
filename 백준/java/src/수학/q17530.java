package 수학;

import java.util.Scanner;

public class q17530 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int r = 0;
        int s = 0;
        for (int i = 0; i < n; i++) {
            int t = scan.nextInt();
            if (s < t) {
                s = t;
                r = i;
            }
        }
        if (r == 0) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
        scan.close();
    }
}
