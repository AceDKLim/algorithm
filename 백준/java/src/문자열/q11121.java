package 문자열;

import java.util.Scanner;

public class q11121 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            String a = scan.next();
            String b = scan.next();
            String r = a.equals(b) ? "OK" : "ERROR";
            System.out.println(r);
        }
        scan.close();
    }
}
