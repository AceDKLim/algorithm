package 문자열;

import java.util.Scanner;

public class q26502 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String s = scan.nextLine();
            String r = "";
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'y') {
                    r += "a";
                } else if (s.charAt(j) == 'a') {
                    r += "e";
                } else if (s.charAt(j) == 'e') {
                    r += "i";
                } else if (s.charAt(j) == 'i') {
                    r += "o";
                } else if (s.charAt(j) == 'o') {
                    r += "u";
                } else if (s.charAt(j) == 'u') {
                    r += "y";
                } else if (s.charAt(j) == 'Y') {
                    r += "A";
                } else if (s.charAt(j) == 'A') {
                    r += "E";
                } else if (s.charAt(j) == 'E') {
                    r += "I";
                } else if (s.charAt(j) == 'I') {
                    r += "O";
                } else if (s.charAt(j) == 'O') {
                    r += "U";
                } else if (s.charAt(j) == 'U') {
                    r += "Y";
                } else {
                    r += s.charAt(j);
                }
            }
            System.out.println(r);
        }
        scan.close();
    }
}
