package 브루트포스;

import java.util.Scanner;

public class q26906 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        String[] p = new String[16];
        for (int i = 0; i < t; i++) {
            String n = scan.next();
            p[Integer.parseInt(scan.next(), 2)] = n;
        }
        String s = scan.next();
        scan.close();
        String r = "";
        for (int i = 0; i < s.length(); i += 4) {
            int k = Integer.parseInt(s.substring(i, i + 4), 2);
            if (p[k] == null) {
                r += "?";
            } else {
                r += p[k];
            }
        }
        System.out.println(r);
    }
}
