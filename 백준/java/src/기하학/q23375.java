package 기하학;

import java.util.Scanner;

public class q23375 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] dx = { -1, -1, 1, 1 };
        int[] dy = { -1, 1, 1, -1 };
        int x = scan.nextInt();
        int y = scan.nextInt();
        int r = scan.nextInt();
        for (int i = 0; i < 4; i++) {
            System.out.println((dx[i] * r + x) + " " + (dy[i] * r + y));
        }
        scan.close();
    }
}
