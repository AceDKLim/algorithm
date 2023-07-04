package 문자열;

import java.util.Scanner;

public class q9783 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                System.out.printf("%02d", s.charAt(i) - 'a' + 1);
            } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                System.out.print(s.charAt(i) - 'A' + 27);
            } else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                System.out.print("#" + s.charAt(i));
            } else {
                System.out.print(s.charAt(i));
            }
        }
    }
}
