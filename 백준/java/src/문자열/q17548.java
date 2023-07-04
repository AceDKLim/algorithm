package 문자열;

import java.util.Scanner;

public class q17548 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'e') {
                cnt++;
            }
        }
        cnt *= 2;
        System.out.print("h");
        for (int i = 0; i < cnt; i++) {
            System.out.print("e");
        }
        System.out.println("y");
    }
}
