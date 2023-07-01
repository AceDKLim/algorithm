package 문자열;

import java.util.Scanner;

public class q26264 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String m = scan.nextLine();
        scan.close();
        int s = 0;
        int b = 0;
        for (int i = 0; i < m.length(); i++) {
            if (m.charAt(i) == 's') {
                s++;
            } else if (m.charAt(i) == 'b') {
                b++;
            }
            if (b > n / 2 || s > n / 2) {
                break;
            }
        }
        if (b >= s) {
            System.out.print("bigdata? ");
        }
        if (s >= b) {
            System.out.print("security!");
        }
    }
}
