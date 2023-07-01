package 문자열;

import java.util.Scanner;

public class q21964 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        for (int i = n - 5; i < n; i++) {
            System.out.print(s.charAt(i));
        }
        scan.close();
    }
}
