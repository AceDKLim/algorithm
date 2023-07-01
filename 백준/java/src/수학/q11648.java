package 수학;

import java.util.Scanner;

public class q11648 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int c = 0;
        while (n / 10 != 0) {
            String m = Integer.toString(n);
            int r = 1;
            for (int i = 0; i < m.length(); i++) {
                r *= m.charAt(i) - '0';
            }
            n = r;
            c++;
        }
        System.out.println(c);
    }
}
