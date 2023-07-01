package 수학;

import java.util.Scanner;

public class q2965 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        int n = Math.max(b - a, c - b);
        System.out.println(n - 1);
    }
}
