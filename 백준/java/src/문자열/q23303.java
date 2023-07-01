package 문자열;

import java.util.Scanner;

public class q23303 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        String r = "unrated";
        for (int i = 0; i < s.length() - 1; i++) {
            if ((s.charAt(i) == 'd' || s.charAt(i) == 'D') && s.charAt(i + 1) == '2') {
                r = "D2";
                break;
            }
        }
        System.out.println(r);
    }
}
