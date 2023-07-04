package 문자열;

import java.util.Scanner;

public class q5365 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String[] s = scan.nextLine().split(" ");
        scan.close();
        int t = 0;
        for (int i = 0; i < n; i++) {
            if (s[i].length() > t) {
                System.out.print(s[i].charAt(t));
            } else {
                System.out.print(" ");
            }
            t = s[i].length() - 1;
        }
    }
}
