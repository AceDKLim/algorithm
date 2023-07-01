package 문자열;

import java.util.Scanner;

public class q26768 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                System.out.print(4);
            } else if (s.charAt(i) == 'e') {
                System.out.print(3);
            } else if (s.charAt(i) == 'i') {
                System.out.print(1);
            } else if (s.charAt(i) == 'o') {
                System.out.print(0);
            } else if (s.charAt(i) == 's') {
                System.out.print(5);
            } else {
                System.out.print(s.charAt(i));
            }
        }
    }
}
