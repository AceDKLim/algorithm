package 기하학;

import java.util.Arrays;
import java.util.Scanner;

public class q5617 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int acute = 0;
        int obtuse = 0;
        int right = 0;
        while (true) {
            int tri[] = new int[3];
            for (int i = 0; i < 3; i++) {
                tri[i] = scan.nextInt();
            }
            if (tri[0] + tri[1] <= tri[2]) {
                break;
            }
            Arrays.sort(tri);
            int x = (int) Math.pow(tri[2], 2);
            int y = (int) Math.pow(tri[1], 2) + (int) Math.pow(tri[0], 2);
            if (x == y) {
                right++;
            } else if (x > y) {
                obtuse++;
            } else if (y > x) {
                acute++;
            }
        }
        int t = acute + obtuse + right;
        System.out.println(t + " " + right + " " + acute + " " + obtuse);
        System.out.println("CR + LF");
        scan.close();
    }
}
