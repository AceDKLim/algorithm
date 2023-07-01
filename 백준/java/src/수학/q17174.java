package 수학;

import java.util.Scanner;

public class q17174 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        int r = a;
        while (a > 0) {
            a /= b;
            r += a;
        }
        System.out.println(r);
    }
}
