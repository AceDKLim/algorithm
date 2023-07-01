package 구현;

import java.util.Scanner;

public class q21866 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = 0;
        int h = 0;
        int[] p = { 100, 100, 200, 200, 300, 300, 400, 400, 500 };
        for (int i = 0; i < 9; i++) {
            int n = scan.nextInt();
            if (n > p[i]) {
                h = 1;
            }
            s += n;
        }
        scan.close();
        if (h == 1) {
            System.out.println("hacker");
        } else if (s < 100) {
            System.out.println("none");
        } else {
            System.out.println("draw");
        }
    }
}
