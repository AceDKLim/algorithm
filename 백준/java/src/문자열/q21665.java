package 문자열;

import java.util.Scanner;

public class q21665 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        String[] p1 = new String[n];
        String[] p2 = new String[n];
        for (int i = 0; i < n; i++) {
            p1[i] = scan.next();
        }
        for (int i = 0; i < n; i++) {
            p2[i] = scan.next();
        }
        scan.close();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char a = p1[i].charAt(j);
                char b = p2[i].charAt(j);
                if (a == b) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
