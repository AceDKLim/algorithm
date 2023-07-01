package 문자열;

import java.util.Scanner;

public class q11586 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = scan.next();
        }
        int k = scan.nextInt();
        scan.close();
        if (k == 1) {
            for (int i = 0; i < n; i++) {
                System.out.println(s[i]);
            }
        } else if (k == 2) {
            for (int i = 0; i < n; i++) {
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(s[i].charAt(j));
                }
                System.out.println();
            }
        } else if (k == 3) {
            for (int i = n - 1; i >= 0; i--) {
                System.out.println(s[i]);
            }
        }
    }
}
