package 문자열;

import java.util.Scanner;

public class q5357 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            String s = scan.next();
            String r = "" + s.charAt(0);
            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(j - 1) != s.charAt(j)) {
                    r += s.charAt(j);
                }
            }
            System.out.println(r);
        }
        scan.close();
    }
}
