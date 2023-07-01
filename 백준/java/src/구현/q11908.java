package 구현;

import java.util.Scanner;

public class q11908 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = 0;
        int s = 0;
        for (int i = 0; i < n; i++) {
            int t = scan.nextInt();
            s += t;
            m = Math.max(t, m);
        }
        scan.close();
        System.out.println(s - m);
    }
}
