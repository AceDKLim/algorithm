package 수학;

import java.util.Scanner;

public class q27262 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long k = scan.nextLong();
        long a = scan.nextLong();
        long b = scan.nextLong();
        scan.close();
        long x = (k - 1) * b + (n - 1) * b;
        long y = (n - 1) * a;
        System.out.println(x + " " + y);
    }
}
