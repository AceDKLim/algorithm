package 수학;

import java.util.Scanner;

public class q27465 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        scan.close();
        n = n % 2 == 1 ? n + 1 : n;
        n = n == 2 ? n = 4 : n;
        System.out.println(n);
    }
}
