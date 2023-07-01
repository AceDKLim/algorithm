package 수학;

import java.util.Scanner;

public class q8674 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long b = scan.nextLong();
        if (a % 2 == 0 || b % 2 == 0) {
            System.out.println(0);
        } else if (a < b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
        scan.close();
    }
}