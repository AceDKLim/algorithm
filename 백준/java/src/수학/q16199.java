package 수학;

import java.util.Scanner;

public class q16199 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int by = scan.nextInt();
        int bm = scan.nextInt();
        int bd = scan.nextInt();
        int ny = scan.nextInt();
        int nm = scan.nextInt();
        int nd = scan.nextInt();

        int man = ny - by;
        if (bm >= nm) {
            if (bm > nm) {
                man -= 1;
            } else if (bd > nd) {
                man -= 1;
            }
        }

        int cnt = ny - by + 1;
        int ye = ny - by;

        System.out.println(man);
        System.out.println(cnt);
        System.out.println(ye);
        scan.close();
    }
}
