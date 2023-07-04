package 문자열;

import java.util.Scanner;

public class q8371 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String a = scan.next();
        String b = scan.next();
        scan.close();
        int r = 0;
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                r++;
            }
        }
        System.out.println(r);
    }
}
