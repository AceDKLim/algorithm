package 문자열;

import java.util.Scanner;

public class q16316 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String r = "makes sense";
        for (int i = 1; i <= n; i++) {
            String s = scan.next();
            if (s.equals("mumble")) {
                continue;
            }
            if (Integer.parseInt(s) != i) {
                r = "something is fishy";
            }
        }
        scan.close();
        System.out.println(r);
    }
}
