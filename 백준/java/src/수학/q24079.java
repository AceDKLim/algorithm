package 수학;

import java.util.Scanner;

public class q24079 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        scan.close();
        if (x + y > z) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
