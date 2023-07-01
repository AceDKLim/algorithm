package 문자열;

import java.util.Scanner;

public class q24196 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();
        int c = 0;
        while (c < s.length()) {
            char t = s.charAt(c);
            System.out.print(t);
            c += (int) (t - 'A' + 1);
        }
    }
}
