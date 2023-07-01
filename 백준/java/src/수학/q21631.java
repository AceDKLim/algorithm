package 수학;

import java.util.Scanner;

public class q21631 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long w = scan.nextLong();
        long b = scan.nextLong();
        scan.close();
        long r = w >= b ? b : w + 1;
        System.out.println(r);
    }
}
