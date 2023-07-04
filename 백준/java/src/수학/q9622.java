package 수학;

import java.util.Scanner;

public class q9622 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int cnt = 0;
        for (int i = 0; i < t; i++) {
            double length = scan.nextDouble();
            double width = scan.nextDouble();
            double depth = scan.nextDouble();
            double weight = scan.nextDouble();
            double s = length + width + depth;
            if (((length <= 56 && width <= 45 && depth <= 25) || s <= 125) && weight <= 7) {
                System.out.println(1);
                cnt++;
            } else {
                System.out.println(0);
            }
        }
        scan.close();
        System.out.println(cnt);
    }
}
