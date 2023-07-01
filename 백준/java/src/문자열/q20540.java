package 문자열;

import java.util.Scanner;

public class q20540 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String mbti = scan.nextLine();
        scan.close();
        for (int i = 0; i < 4; i++) {
            if (mbti.charAt(i) == 'E') {
                System.out.print('I');
            } else if (mbti.charAt(i) == 'I') {
                System.out.print('E');
            } else if (mbti.charAt(i) == 'S') {
                System.out.print('N');
            } else if (mbti.charAt(i) == 'N') {
                System.out.print('S');
            } else if (mbti.charAt(i) == 'T') {
                System.out.print('F');
            } else if (mbti.charAt(i) == 'F') {
                System.out.print('T');
            } else if (mbti.charAt(i) == 'J') {
                System.out.print('P');
            } else if (mbti.charAt(i) == 'P') {
                System.out.print('J');
            }
        }
    }
}
