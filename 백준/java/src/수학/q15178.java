package 수학;

import java.util.Scanner;

public class q15178 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int[] tri = new int[3];
            int s = 0;
            for (int j = 0; j < 3; j++) {
                tri[j] = scan.nextInt();
                s += tri[j];
            }
            for (int j : tri) {
                System.out.print(j + " ");
            }
            if (s == 180) {
                System.out.println("Seems OK");
            } else {
                System.out.println("Check");
            }
        }
        scan.close();
    }
}
