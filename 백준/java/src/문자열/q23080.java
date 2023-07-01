package 문자열;

import java.util.Scanner;

public class q23080 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        String s = scan.next();
        scan.close();
        int n = 0;
        while (n < s.length()) {
            System.out.print(s.charAt(n));
            n += k;
        }
    }
}
