package 문자열;

import java.util.Scanner;

public class q26546 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            String s = scan.next();
            int a = scan.nextInt();
            int b = scan.nextInt();
            for (int j = 0; j < s.length(); j++) {
                if (j < a || j >= b) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
        scan.close();
    }
}
