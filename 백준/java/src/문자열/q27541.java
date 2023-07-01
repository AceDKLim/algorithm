package 문자열;

import java.util.Scanner;

public class q27541 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        scan.close();
        if (s.charAt(n - 1) == 'G') {
            for (int i = 0; i < n - 1; i++) {
                System.out.print(s.charAt(i));
            }
        } else {
            System.out.print(s);
            System.out.println('G');
        }
    }
}
