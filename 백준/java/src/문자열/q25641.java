package 문자열;

import java.util.Scanner;

public class q25641 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String g = scan.next();
        scan.close();
        int s = 0;
        int t = 0;
        for (int i = 0; i < n; i++) {
            if (g.charAt(i) == 's') {
                s++;
            } else {
                t++;
            }
        }
        int r = 0;
        for (int i = 0; i < n; i++) {
            if (s == t) {
                r = i;
                break;
            }
            if (g.charAt(i) == 's') {
                s--;
            } else {
                t--;
            }
        }
        for (int i = r; i < n; i++) {
            System.out.print(g.charAt(i));
        }
    }
}
