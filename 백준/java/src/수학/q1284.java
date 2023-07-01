package 수학;

import java.util.Scanner;

public class q1284 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            String s = scan.next();
            if (s.equals("0")) {
                break;
            }
            int r = s.length() + 1;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    r += 2;
                } else if (s.charAt(i) == '0') {
                    r += 4;
                } else {
                    r += 3;
                }
            }
            System.out.println(r);
        }
        scan.close();
    }
}
