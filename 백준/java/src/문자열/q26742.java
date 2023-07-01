package 문자열;

import java.util.Scanner;

public class q26742 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();
        int b = 0;
        int w = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'B') {
                b++;
            } else {
                w++;
            }
        }
        System.out.println(b / 2 + w / 2);
    }
}
