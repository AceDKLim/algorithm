package 수학;

import java.util.Scanner;

public class q3058 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int s = 0;
            int m = 100;
            for (int j = 0; j < 7; j++) {
                int c = scan.nextInt();
                if (c % 2 == 0) {
                    s += c;
                    if (c < m) {
                        m = c;
                    }
                }
            }
            System.out.println(s + " " + m);
        }
        scan.close();
    }
}
