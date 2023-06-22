package 기하학;

import java.util.Arrays;
import java.util.Scanner;

public class q1925 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int coord[][] = new int[3][2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                coord[i][j] = scan.nextInt();
            }
        }
        double l[] = new double[3];
        l[0] = Math.pow(coord[0][0] - coord[1][0], 2) + Math.pow(coord[0][1] - coord[1][1], 2);
        l[1] = Math.pow(coord[1][0] - coord[2][0], 2) + Math.pow(coord[1][1] - coord[2][1], 2);
        l[2] = Math.pow(coord[2][0] - coord[0][0], 2) + Math.pow(coord[2][1] - coord[0][1], 2);
        Arrays.sort(l);
        if (Math.sqrt(l[0]) + Math.sqrt(l[1]) <= Math.sqrt(l[2])) {
            System.out.println("X");
        } else if (l[0] == l[1] || l[1] == l[2]) {
            if (l[0] + l[1] == l[2]) {
                System.out.println("Jikkak2Triangle");
            } else if (l[0] + l[1] > l[2]) {
                System.out.println("Yeahkak2Triangle");
            } else {
                System.out.println("Dunkak2Triangle");
            }
        } else {
            if (l[0] + l[1] == l[2]) {
                System.out.println("JikkakTriangle");
            } else if (l[0] + l[1] > l[2]) {
                System.out.println("YeahkakTriangle");
            } else {
                System.out.println("DunkakTriangle");
            }
        }
        scan.close();
    }
}
