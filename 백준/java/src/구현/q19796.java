package 구현;

import java.util.Scanner;

public class q19796 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[] r = new int[m + 1];
        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            for (int j = a; j <= b; j++) {
                r[j] = 1;
            }
        }
        scan.close();
        String s = "YES";
        for (int i = 1; i <= m; i++) {
            if (r[i] != 1) {
                s = "NO";
                break;
            }
        }
        System.out.println(s);
    }
}
