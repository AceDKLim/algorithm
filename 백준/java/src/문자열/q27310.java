package 문자열;

import java.util.Scanner;

public class q27310 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int under = 0;
        int col = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ':') {
                col++;
            } else if (s.charAt(i) == '_') {
                under++;
            }
        }
        System.out.println(s.length() + col + under * 5);
        scan.close();
    }
}
