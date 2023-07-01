package 수학;

import java.util.Scanner;

public class q26530 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            float r = 0f;
            for (int j = 0; j < n; j++) {
                scan.next();
                float x = scan.nextFloat();
                float y = scan.nextFloat();
                r += x * y;
            }
            System.out.println(String.format("$%.2f", r));
        }
        scan.close();
    }
}
