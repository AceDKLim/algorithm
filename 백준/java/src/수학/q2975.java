package 수학;

import java.util.Scanner;

public class q2975 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int n = scan.nextInt();
            String s = scan.next();
            int m = scan.nextInt();
            if (n == 0 && m == 0 && s.equals("W")) {
                break;
            }
            if (s.equals("W")) {
                n -= m;
            } else if (s.equals("D")) {
                n += m;
            }
            if (n < -200) {
                System.out.println("Not allowed");
            } else {
                System.out.println(n);
            }
        }
        scan.close();
    }
}
