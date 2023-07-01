package 문자열;

import java.util.Scanner;

public class q5358 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String s = scan.nextLine();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'i') {
                    System.out.print('e');
                } else if (s.charAt(i) == 'e') {
                    System.out.print('i');
                } else if (s.charAt(i) == 'E') {
                    System.out.print('I');
                } else if (s.charAt(i) == 'I') {
                    System.out.print('E');
                } else {
                    System.out.print(s.charAt(i));
                }
            }
            System.out.println();
        }
        scan.close();
    }
}
