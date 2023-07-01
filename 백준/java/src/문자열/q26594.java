package 문자열;

import java.util.Scanner;

public class q26594 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();
        char t = s.charAt(0);
        long r = 1000001;
        long c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t) {
                r = Math.min(r, i - c);
                t = s.charAt(i);
                c = i;
            }
        }
        System.out.print(r);
    }
}
