package 문자열;

import java.util.Scanner;

public class q26736 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        int a = 0;
        int b = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                a++;
            } else {
                b++;
            }
        }
        System.out.println(String.format("%d : %d", a, b));
    }
}
