package 구현;

import java.util.Scanner;

public class q20839 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        int a = scan.nextInt();
        int c = scan.nextInt();
        int e = scan.nextInt();
        scan.close();
        char result = 'E';
        if (c >= y) {
            if (a * 2 >= x) {
                if (a >= x) {
                    result = 'A';
                } else {
                    result = 'B';
                }

            } else {
                result = 'C';
            }
        } else if (c * 2 >= y) {
            result = 'D';
        }
        System.out.println(result);
        z += e;
        e += z;
    }
}
