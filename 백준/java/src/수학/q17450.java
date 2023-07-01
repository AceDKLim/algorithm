package 수학;

import java.util.Scanner;

public class q17450 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float sp = scan.nextFloat() * 10;
        float sw = scan.nextFloat() * 10;
        float np = scan.nextFloat() * 10;
        float nw = scan.nextFloat() * 10;
        float up = scan.nextFloat() * 10;
        float uw = scan.nextFloat() * 10;
        scan.close();
        sp = sp >= 5000 ? sp - 500 : sp;
        np = np >= 5000 ? np - 500 : np;
        up = up >= 5000 ? up - 500 : up;
        float s = sw / sp;
        float n = nw / np;
        float u = uw / up;

        if (s < n && u < n) {
            System.out.println("N");
        } else if (n < s && u < s) {
            System.out.println("S");
        } else {
            System.out.println("U");
        }
    }
}
