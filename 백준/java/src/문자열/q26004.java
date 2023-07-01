package 문자열;

import java.util.Scanner;

public class q26004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        scan.close();
        int h = 0;
        int i = 0;
        int a = 0;
        int r = 0;
        int c = 0;
        for (int t = 0; t < n; t++) {
            char ch = s.charAt(t);
            if (ch == 'H') {
                h++;
            } else if (ch == 'I') {
                i++;
            } else if (ch == 'A') {
                a++;
            } else if (ch == 'R') {
                r++;
            } else if (ch == 'C') {
                c++;
            }
        }
        System.out.println(Math.min(h, Math.min(i, Math.min(a, Math.min(r, c)))));
    }
}