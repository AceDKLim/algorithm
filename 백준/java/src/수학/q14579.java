package 수학;

import java.util.Scanner;

public class q14579 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        int r = 1;
        for (int i = a; i <= b; i++) {
            int n = 0;
            for (int j = 1; j <= i; j++) {
                n += j;
            }
            r *= n;
            r %= 14579;
        }
        System.out.println(r);
    }
}
