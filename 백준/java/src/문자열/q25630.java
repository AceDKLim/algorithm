package 문자열;

import java.util.Scanner;

public class q25630 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String s = scan.nextLine();
        scan.close();
        int k = n % 2 == 0 ? -1 : 0;
        int r = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (s.charAt(n / 2 - i) != s.charAt(n / 2 + i + k)) {
                r++;
            }
        }
        System.out.println(r);
    }
}
