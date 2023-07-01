package 구현;

import java.util.Scanner;

public class q14038 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = 0;
        for (int i = 0; i < 6; i++) {
            if (scan.next().equals("W")) {
                cnt++;
            }
        }
        if (cnt == 0) {
            System.out.println(-1);
        } else if (cnt <= 2) {
            System.out.println(3);
        } else if (cnt <= 4) {
            System.out.println(2);
        } else {
            System.out.println(1);
        }
        scan.close();
    }
}
