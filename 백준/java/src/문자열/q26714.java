package 문자열;

import java.util.Scanner;

public class q26714 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        scan.close();
        int t = n / 10;
        int cnt = 0;
        for (int i = 0; i < n; i += t) {
            int c = 0;
            String r = s.substring(i, i + t);
            for (int j = 0; j < t; j++) {
                if (r.charAt(j) == 'N') {
                    c++;
                }
            }
            if (c == 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
