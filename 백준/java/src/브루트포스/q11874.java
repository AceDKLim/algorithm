package 브루트포스;

import java.util.Scanner;

public class q11874 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int d = scan.nextInt();
        int x = scan.nextInt();
        scan.close();
        int r1 = 10000;
        int r2 = 0;
        for (int i = l; i <= d; i++) {
            String[] s = Integer.toString(i).split("");
            int c = 0;
            for (String j : s) {
                c += Integer.parseInt(j);
            }
            if (c == x) {
                r1 = Math.min(i, r1);
                r2 = Math.max(i, r2);
            }
        }
        System.out.println(r1);
        System.out.println(r2);
    }
}
