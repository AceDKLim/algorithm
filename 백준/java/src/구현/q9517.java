package 구현;

import java.util.Scanner;

public class q9517 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int n = scan.nextInt();
        int r = 0;
        int a = 0;
        boolean c = true;
        for (int i = 0; i < n; i++) {
            int t = scan.nextInt();
            String z = scan.next();
            r += t;
            if (r >= 210 && c == true) {
                a = k;
                c = false;
            }
            if (z.equals("T")) {
                k = k == 8 ? 1 : k + 1;
            }
        }
        System.out.println(a);
        scan.close();
    }
}
