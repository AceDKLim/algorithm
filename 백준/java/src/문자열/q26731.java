package 문자열;

import java.util.Arrays;
import java.util.Scanner;

public class q26731 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s[] = scan.nextLine().split("");
        scan.close();
        Arrays.sort(s);
        if (s[24].equals("Z")) {
            int t = (int) 'A' - 1;
            for (String i : s) {
                int p = (int) i.charAt(0);
                if (p - t != 1) {
                    System.out.println((char) (p - 1));
                    break;
                } else {
                    t = p;
                }
            }
        } else {
            System.out.println("Z");
        }
    }
}
