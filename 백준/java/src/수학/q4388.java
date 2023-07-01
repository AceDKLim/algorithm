package 수학;

import java.util.Scanner;

public class q4388 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            String a = scan.next();
            String b = scan.next();
            if (a.equals("0") && b.equals("0")) {
                break;
            }
            String x = "";
            for (int i = 0; i < 10 - a.length(); i++) {
                x += "0";
            }
            x += a;
            String[] n = x.split("");

            String y = "";
            for (int i = 0; i < 10 - b.length(); i++) {
                y += "0";
            }
            y += b;
            String[] m = y.split("");

            int cnt = 0;
            for (int i = 9; i > 0; i--) {
                if (Integer.parseInt(n[i]) + Integer.parseInt(m[i]) > 9) {
                    cnt++;
                    n[i - 1] = Integer.toString(Integer.parseInt(n[i - 1]) + 1);
                    n[i] = Integer.toString(Integer.parseInt(n[i]) - 10);
                }
            }
            if (Integer.parseInt(n[0]) + Integer.parseInt(m[0]) > 9) {
                cnt++;
            }
            System.out.println(cnt);
        }
        scan.close();
    }
}
