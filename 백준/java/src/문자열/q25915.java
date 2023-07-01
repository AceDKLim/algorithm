package 문자열;

import java.util.Scanner;

public class q25915 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char s = scan.next().charAt(0);
        scan.close();
        String m = "ILOVEYONSEI";
        int r = 0;
        for (int i = 0; i < m.length(); i++) {
            r += Math.abs(s - m.charAt(i));
            s = m.charAt(i);
        }
        System.out.println(r);
    }
}
