package 구현;

import java.util.Scanner;

public class q5612 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int s = scan.nextInt();
        int r = s;
        boolean c = true;
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            s += x;
            s -= y;
            if (s < 0) {
                c = false;
                r = 0;
            }
            if (c == true) {
                r = Math.max(r, s);
            }
        }
        System.out.println(r);
        scan.close();
    }
}
