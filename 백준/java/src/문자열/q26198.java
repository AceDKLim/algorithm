package 문자열;

import java.util.Scanner;

public class q26198 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            int r = 0;
            String s = scan.nextLine();
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == 'I') {
                    r += 1;
                } else if (c == 'V') {
                    r += 5;
                } else if (c == 'X') {
                    r += 10;
                } else if (c == 'L') {
                    r += 50;
                } else if (c == 'C') {
                    r += 100;
                } else if (c == 'D') {
                    r += 500;
                } else if (c == 'M') {
                    r += 1000;
                }
            }
            System.out.println(r);
        }
        scan.close();
    }
}
