package 브루트포스;

import java.util.Scanner;

public class q27590 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ds = scan.nextInt();
        int ys = scan.nextInt();
        int dm = scan.nextInt();
        int ym = scan.nextInt();
        scan.close();
        int rs = ys - ds;
        int rm = ym - dm;
        while (rs != rm) {
            if (rs > rm) {
                rm += ym;
            } else {
                rs += ys;
            }
        }
        System.out.println(rs);
    }
}
