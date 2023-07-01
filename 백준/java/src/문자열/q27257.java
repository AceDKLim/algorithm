package 문자열;

import java.util.Scanner;

public class q27257 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        while (n % 10 == 0) {
            n /= 10;
        }

        int cnt = 0;
        String s = Integer.toString(n);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
