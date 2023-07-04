package 문자열;

import java.util.Scanner;

public class q26040 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String[] b = scan.nextLine().split(" ");
        scan.close();
        int[] r = new int[26];
        for (String i : b) {
            r[i.charAt(0) - 'A'] = 1;
        }
        for (int i = 0; i < a.length(); i++) {
            int n = a.charAt(i) - 'A';
            if (n < 26 && r[n] == 1) {
                System.out.print(Character.toLowerCase(a.charAt(i)));
            } else {
                System.out.print(a.charAt(i));
            }
        }
    }
}
