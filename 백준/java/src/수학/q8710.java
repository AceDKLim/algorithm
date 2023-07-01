package 수학;

import java.util.Scanner;

public class q8710 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int w = scan.nextInt();
        int m = scan.nextInt();
        int r = 0;
        if ((w - k) % m == 0) {
            r = (w - k) / m;
        } else {
            r = (w - k) / m + 1;
        }
        System.out.println(r);
        scan.close();
    }
}
