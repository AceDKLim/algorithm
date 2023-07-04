package 문자열;

import java.util.Scanner;

public class q26392 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int r = scan.nextInt();
        int s = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int ma = 0;
            int mi = 50;
            String[] m = new String[r];
            for (int j = 0; j < r; j++) {
                m[j] = scan.next();
            }
            for (int j = 0; j < s; j++) {
                for (int k = 0; k < r; k++) {
                    if (m[k].charAt(j) == '#') {
                        ma = Math.max(ma, k);
                        mi = Math.min(mi, k);
                    }
                }
            }
            System.out.println(ma - mi);
        }
        scan.close();
    }
}
