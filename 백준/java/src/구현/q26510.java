package 구현;

import java.util.Scanner;

public class q26510 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] s = scan.nextLine().split(" ");
        scan.close();
        for (String n : s) {
            int mg = Integer.parseInt(n) * 2 - 3;
            int sg = 0;
            for (int i = 0; i < Integer.parseInt(n); i++) {
                for (int j = 0; j < sg; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = 0; j < mg; j++) {
                    System.out.print(" ");
                }
                if (mg != -1) {
                    System.out.print("*");
                }
                System.out.println();
                mg -= 2;
                sg++;
            }
        }
    }
}
