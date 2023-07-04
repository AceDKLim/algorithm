package 문자열;

import java.util.Scanner;

public class q23343 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] s = scan.nextLine().split(" ");
        scan.close();
        if (s.length == 1) {
            System.out.println("NaN");
        } else {
            boolean c = false;
            for (int i = 0; i < s[0].length(); i++) {
                if (s[0].charAt(i) < '0' || s[0].charAt(i) > '9') {
                    c = true;
                    break;
                }
            }
            for (int i = 0; i < s[1].length(); i++) {
                if (s[1].charAt(i) < '0' || s[1].charAt(i) > '9') {
                    c = true;
                    break;
                }
            }
            if (c == true) {
                System.out.println("NaN");
            } else {
                System.out.println(Integer.parseInt(s[0]) - Integer.parseInt(s[1]));
            }
        }
    }
}
