package 수학;

import java.util.Scanner;

public class q10409 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int t = scan.nextInt();
        int s = 0;
        int cnt = 0;
        int k = 0;
        for (int i = 0; i < n; i++) {
            int p = scan.nextInt();
            if (s + p <= t && k == 0) {
                s += p;
                cnt++;
            } else {
                k = 1;
            }
        }
        System.out.println(cnt);
        scan.close();
    }
}
