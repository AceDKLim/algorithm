package 문자열;

import java.util.Scanner;

public class q11283 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char c = scan.next().charAt(0);
        int n = c - '가';
        int cho = n / 28 / 21;
        int joong = n / 28 % 21;
        int jong = n % 28;
        int r = 0;
        r += cho * 21 * 28;
        r += joong * 28;
        r += jong + 1;
        System.out.println(r);
        scan.close();
    }
}