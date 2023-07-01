package 수학;

import java.util.Scanner;

public class q2953 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int winner = 0;
        int winscore = 0;
        for (int i = 0; i < 5; i++) {
            int w = 0;
            for (int j = 0; j < 4; j++) {
                w += scan.nextInt();
            }
            if (w > winscore) {
                winscore = w;
                winner = i + 1;
            }
        }
        System.out.println(winner + " " + winscore);
        scan.close();
    }
}
