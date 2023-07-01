package 수학;

import java.util.Scanner;

public class q21612 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        int p = 5 * b - 400;
        System.out.println(p);
        int r = p > 100 ? -1 : p == 100 ? 0 : 1;
        System.out.println(r);
        scan.close();
    }
}
