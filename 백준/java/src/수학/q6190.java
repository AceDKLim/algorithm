package 수학;

import java.util.Scanner;

public class q6190 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        scan.close();
        long r = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n *= 3;
                n++;
            }
            r++;
        }
        System.out.println(r);
    }
}
