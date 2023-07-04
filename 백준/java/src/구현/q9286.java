package 구현;

import java.util.Scanner;

public class q9286 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = scan.nextInt();
            String r = "";
            for (int j = 0; j < n; j++) {
                int g = scan.nextInt();
                if (g != 6) {
                    r += g + 1;
                }
            }
            System.out.printf("Case %d:\n", i);
            for (int j = 0; j < r.length(); j++) {
                System.out.println(r.charAt(j));
            }
        }
        scan.close();
    }
}
