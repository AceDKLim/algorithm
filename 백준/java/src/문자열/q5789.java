package 문자열;

import java.util.Scanner;

public class q5789 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            String s = scan.next();
            if (s.charAt(s.length() / 2) != s.charAt(s.length() / 2 - 1)) {
                System.out.println("Do-it-Not");
            } else {
                System.out.println("Do-it");
            }
        }
        scan.close();
    }
}
