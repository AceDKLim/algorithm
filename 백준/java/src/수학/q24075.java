package 수학;

import java.util.Scanner;

public class q24075 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        int s = a + b;
        int m = a - b;
        if (s < m) {
            int t = s;
            s = m;
            m = t;
        }
        System.out.println(s);
        System.out.println(m);
    }
}
