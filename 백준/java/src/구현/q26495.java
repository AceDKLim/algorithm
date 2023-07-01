package 구현;

import java.util.Scanner;

public class q26495 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] n = scan.next().split("");
        scan.close();
        String[][] num = { { "0000", "0  0", "0  0", "0  0", "0000" }, { "   1", "   1", "   1", "   1", "   1" },
                { "2222", "   2", "2222", "2", "2222" }, { "3333", "   3", "3333", "   3", "3333", },
                { "4  4", "4  4", "4444", "   4", "   4" }, { "5555", "5", "5555", "   5", "5555" },
                { "6666", "6", "6666", "6  6", "6666", }, { "7777", "   7", "   7", "   7", "   7" },
                { "8888", "8  8", "8888", "8  8", "8888", }, { "9999", "9  9", "9999", "   9", "   9" } };
        for (String i : n) {
            int r = Integer.parseInt(i);
            for (int j = 0; j < 5; j++) {
                System.out.println(num[r][j]);
            }
            System.out.println();
        }
    }
}
