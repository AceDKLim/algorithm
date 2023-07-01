package 수학;

import java.util.Scanner;

public class q4084 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int d = scan.nextInt();
            if (a == 0 && b == 0 && c == 0 && d == 0) {
                break;
            }
            int cnt = 0;
            while (a != b || b != c || c != d) {
                int x = Math.abs(a - b);
                int y = Math.abs(b - c);
                int z = Math.abs(c - d);
                int r = Math.abs(d - a);
                a = x;
                b = y;
                c = z;
                d = r;
                cnt++;
            }
            System.out.println(cnt);
        }
        scan.close();
    }
}
