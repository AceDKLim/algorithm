package 구현;

import java.util.Scanner;

public class q13698 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        int[] cup = { 1, 0, 0, 2 };
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                int t = cup[0];
                cup[0] = cup[1];
                cup[1] = t;
            } else if (s.charAt(i) == 'B') {
                int t = cup[0];
                cup[0] = cup[2];
                cup[2] = t;
            } else if (s.charAt(i) == 'C') {
                int t = cup[0];
                cup[0] = cup[3];
                cup[3] = t;
            } else if (s.charAt(i) == 'D') {
                int t = cup[1];
                cup[1] = cup[2];
                cup[2] = t;
            } else if (s.charAt(i) == 'E') {
                int t = cup[1];
                cup[1] = cup[3];
                cup[3] = t;
            } else if (s.charAt(i) == 'F') {
                int t = cup[2];
                cup[2] = cup[3];
                cup[3] = t;
            }
        }
        int a = 0;
        for (int i = 0; i < 4; i++) {
            if (cup[i] == 1) {
                System.out.println(i + 1);
            } else if (cup[i] == 2) {
                a = i + 1;
            }
        }
        System.out.println(a);
    }
}
