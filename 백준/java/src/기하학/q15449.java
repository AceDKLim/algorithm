package 기하학;

import java.util.Arrays;
import java.util.Scanner;

public class q15449 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double l[] = new double[5];
        for (int i = 0; i < 5; i++) {
            l[i] = scan.nextDouble();
        }
        Arrays.sort(l);
        int cnt = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = i + 1; j < 5; j++) {
                for (int k = j + 1; k < 5; k++) {
                    if (l[i] + l[j] > l[k]) {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
        scan.close();
    }
}
