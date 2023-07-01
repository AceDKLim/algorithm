package 문자열;

import java.util.Scanner;

public class q2857 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String r = "";
        for (int i = 1; i < 6; i++) {
            String s = scan.next();
            for (int j = 0; j < s.length() - 2; j++) {
                if (s.charAt(j) == 'F' && s.charAt(j + 1) == 'B' && s.charAt(j + 2) == 'I') {
                    r += i + " ";
                    break;
                }
            }
        }
        scan.close();
        if (r == "") {
            System.out.println("HE GOT AWAY!");
        } else {
            System.out.println(r);
        }
    }
}
