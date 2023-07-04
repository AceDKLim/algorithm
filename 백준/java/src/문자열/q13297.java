package 문자열;

import java.util.Scanner;

public class q13297 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            String c = scan.next();
            System.out.println(c.length());
        }
        scan.close();
    }
}
