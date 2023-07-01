package 수학;

import java.util.Scanner;

public class q6888 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        scan.close();
        while (x <= y) {
            System.out.println("All positions change in year " + x);
            x += 60;
        }
    }
}
