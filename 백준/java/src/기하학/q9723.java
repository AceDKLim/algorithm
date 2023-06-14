package 기하학;

import java.util.Arrays;
import java.util.Scanner;

public class q9723 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 1; i <= t; i++) {
            int tri[] = new int[3];
            for (int j = 0; j < 3; j++) {
                tri[j] = scan.nextInt();
            }
            Arrays.sort(tri);
            if (Math.pow(tri[0], 2) + Math.pow(tri[1], 2) == Math.pow(tri[2], 2)) {
                System.out.println("Case #" + i + ": YES");
            } else {
                System.out.println("Case #" + i + ": NO");
            }
        }
        scan.close();
    }
}
