package 수학;

import java.util.Scanner;

public class q15474 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int x = n % a == 0 ? n / a : n / a + 1;
        int y = n % c == 0 ? n / c : n / c + 1;

        int r = x * b > y * d ? y * d : x * b;
        System.out.println(r);
        scan.close();
    }
}
