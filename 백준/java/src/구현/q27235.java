package 구현;

import java.util.Scanner;

public class q27235 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        scan.close();
        int c = 1;
        int r = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'L') {
                c = Math.max(1, c - 1);
            } else if (s.charAt(i) == 'R') {
                c = Math.min(3, c + 1);
            }
            if (c == 3) {
                r++;
            }
        }
        System.out.println(r);
    }
}
