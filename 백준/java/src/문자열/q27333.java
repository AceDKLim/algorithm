package 문자열;

import java.util.Scanner;

public class q27333 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] s = scan.next().split("");
        scan.close();
        for (int i = 0; i < n; i++) {
            if ((i == 0 || i == 1) && (s[i].equals(s[i + 1]) || s[i].equals(s[i - 1]))) {
                if (s[i].equals("j")) {
                    s[i] = "J";
                } else if (s[i].equals("o")) {
                    s[i] = "O";
                } else if (s[i].equals("i")) {
                    s[i] = "I";
                }
            } else if (s[i].equals(s[i - 1]) && s[i].equalsIgnoreCase(s[i - 2])) {
                if (s[i].equals("j")) {
                    s[i] = "J";
                } else if (s[i].equals("o")) {
                    s[i] = "O";
                } else if (s[i].equals("i")) {
                    s[i] = "I";
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
