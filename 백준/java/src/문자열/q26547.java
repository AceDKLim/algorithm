package 문자열;

import java.util.Scanner;

public class q26547 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            String s = scan.next();
            int l = s.length() - 2;
            System.out.println(s);
            for (int j = 0; j < l; j++) {
                System.out.print(s.charAt(j + 1));
                for (int k = 0; k < l; k++) {
                    System.out.print(" ");
                }
                System.out.println(s.charAt(l - j));
            }
            for (int j = s.length() - 1; j >= 0; j--) {
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
        scan.close();
    }
}
