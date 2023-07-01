package 수학;

import java.util.Scanner;

public class q16431 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int br = scan.nextInt();
        int bc = scan.nextInt();
        int dr = scan.nextInt();
        int dc = scan.nextInt();
        int jr = scan.nextInt();
        int jc = scan.nextInt();
        scan.close();
        int d = Math.abs(dc - jc) + Math.abs(dr - jr);

        int bgr = Math.abs(br - jr);
        int bgc = Math.abs(bc - jc);
        int b = Math.min(bgr, bgc) + Math.abs(bgr - bgc);

        if (b == d) {
            System.out.println("tie");
        } else if (b < d) {
            System.out.println("bessie");
        } else {
            System.out.println("daisy");
        }
    }
}
