package 구현;

import java.util.Scanner;

public class q6916 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        char[][] s = new char[9][7];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 7; j++) {
                s[i][j] = ' ';
            }
        }
        s = n == 0 || n == 2 || n == 3 || n == 5 || n == 6 || n == 7 || n == 8 || n == 9 ? seg(s, 1) : s;
        s = n == 0 || n == 4 || n == 5 || n == 6 || n == 8 || n == 9 ? seg(s, 2) : s;
        s = n == 0 || n == 1 || n == 2 || n == 3 || n == 4 || n == 7 || n == 8 || n == 9 ? seg(s, 3) : s;
        s = n == 2 || n == 3 || n == 4 || n == 5 || n == 6 || n == 8 || n == 9 ? seg(s, 4) : s;
        s = n == 0 || n == 2 || n == 6 || n == 8 ? seg(s, 5) : s;
        s = n == 0 || n == 1 || n == 3 || n == 4 || n == 5 || n == 6 || n == 7 || n == 8 || n == 9 ? seg(s, 6) : s;
        s = n == 0 || n == 2 || n == 3 || n == 5 || n == 6 || n == 8 || n == 9 ? seg(s, 7) : s;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 7; j++) {
                if (s[i][j] == ' ') {
                    if (j == 6) {
                        continue;
                    }
                    int c = 0;
                    for (int k = j; k < 7; k++) {
                        if (s[i][k] == '*') {
                            c++;
                            break;
                        }
                    }
                    if (c != 0) {
                        System.out.print(s[i][j]);
                    }
                } else {
                    System.out.print(s[i][j]);
                }
            }
            System.out.println();
        }

    }

    static char[][] seg(char[][] s, int n) {
        int t = 0;
        int k = 1;
        if (n == 1 || n == 4 || n == 7) {
            if (n == 4) {
                t = 4;
            } else if (n == 7) {
                t = 8;
            }
            for (int i = 1; i < 6; i += 2) {
                s[t][i] = '*';
            }
        } else {
            if (n == 3) {
                t = 6;
            } else if (n == 5) {
                k = 5;
            } else if (n == 6) {
                t = 6;
                k = 5;
            }
            for (int i = k; i < k + 3; i++) {
                s[i][t] = '*';
            }
        }
        return s;
    }
}
