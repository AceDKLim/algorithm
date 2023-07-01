package 문자열;

import java.util.Scanner;

public class q4740 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            String s = scan.nextLine();
            if (s.equals("***")) {
                break;
            }
            for (int i = s.length() - 1; i >= 0; i--) {
                System.out.print(s.charAt(i));
            }
            System.out.println();
        }
        scan.close();
    }
}
