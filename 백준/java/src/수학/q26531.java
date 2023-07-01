package 수학;

import java.util.Scanner;

public class q26531 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        s = s.replace(" ", "");
        int a = s.charAt(0) - '0';
        int b = s.charAt(2) - '0';
        int c = s.charAt(4) - '0';
        if (a + b == c) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
