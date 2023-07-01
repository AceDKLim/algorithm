package 문자열;

import java.util.Scanner;

public class q18198 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        int a = 0;
        int b = 0;
        for (int i = 0; i < s.length(); i += 2) {
            int t = 0;
            if (s.charAt(i) == 'A' && s.charAt(i + 1) == '1') {
                a++;
            } else if (s.charAt(i) == 'A' && s.charAt(i + 1) == '2') {
                a += 2;
            } else if (s.charAt(i) == 'B' && s.charAt(i + 1) == '1') {
                b++;
            } else if (s.charAt(i) == 'B' && s.charAt(i + 1) == '2') {
                b += 2;
            }

            if (t == 0 && (a >= 11 || b >= 11)) {
                if (a >= 11 && Math.abs(a - b) >= 2) {
                    System.out.println("A");
                    break;
                } else if (b >= 11 && Math.abs(a - b) >= 2) {
                    System.out.println("B");
                    break;
                } else {
                    t = 1;
                }
            }

            if (t == 1 && Math.abs(a - b) >= 2) {
                if (a > b) {
                    System.out.println("A");
                    break;
                } else {
                    System.out.println("B");
                }
            }
        }
    }
}
