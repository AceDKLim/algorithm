package 수학;

import java.util.Scanner;

public class q18127 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt() - 2;
        int b = scan.nextInt();
        scan.close();
        long r = 1;
        long s = 1;
        for (int i = 1; i <= b; i++) {
            r += a;
            s += r;
        }
        System.out.println(s);
    }
}
