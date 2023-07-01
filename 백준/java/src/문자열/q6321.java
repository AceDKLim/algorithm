package 문자열;

import java.util.Scanner;

public class q6321 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("String #" + i);
            String s = scan.next();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'Z') {
                    System.out.print('A');
                } else {
                    System.out.print((char) (s.charAt(j) + 1));
                }
            }
            System.out.println();
            System.out.println();
        }
        scan.close();
    }
}
