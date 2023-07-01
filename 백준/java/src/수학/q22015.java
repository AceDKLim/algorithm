package 수학;

import java.util.Arrays;
import java.util.Scanner;

public class q22015 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] eat = new int[3];
        for (int i = 0; i < 3; i++) {
            eat[i] = scan.nextInt();
        }
        scan.close();
        Arrays.sort(eat);
        int r = 0;
        r += eat[2] - eat[0];
        r += eat[2] - eat[1];
        System.out.println(r);
    }
}
