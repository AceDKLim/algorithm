package 문자열;

import java.util.Scanner;

public class q5949 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.next();
        scan.close();
        int s = n.length() % 3;
        System.out.print(n.substring(0, s));
        for (int i = s; i < n.length() - s; i += 3) {
            if (i != 0) {
                System.out.print(",");
            }
            System.out.print(n.substring(i, i + 3));
        }
    }
}
