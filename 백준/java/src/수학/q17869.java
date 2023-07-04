package 수학;

import java.util.Scanner;

public class q17869 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        scan.close();
        long r = 0;
        while (n != 1) {
            if (n % 2 == 1) {
                n++;
            } else {
                n /= 2;
            }
            r++;
        }
        System.out.println(r);
    }
}
