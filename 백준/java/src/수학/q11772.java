package 수학;

import java.util.Scanner;

public class q11772 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        long r = 0;
        for (int i = 0; i < t; i++) {
            long n = scan.nextLong();
            r += Math.pow(n / 10, n % 10);
        }
        System.out.println(r);
        scan.close();
    }
}
