package 브루트포스;

import java.util.Scanner;

public class q24333 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int r = scan.nextInt();
        l = Math.max(l, scan.nextInt());
        r = Math.min(r, scan.nextInt());
        r = Math.min(r, scan.nextInt());
        scan.close();
        System.out.println(Math.max(r - l + 1, 0));
    }
}
