package 기하학;

import java.util.Scanner;

public class q11466 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float h = scan.nextFloat();
        float w = scan.nextFloat();
        if (h > w) {
            Float p = h;
            h = w;
            w = p;
        }
        float r = h / 2f;
        if (w >= 3 * h) {
            r = Math.max(h, r);
        }
        if (w / 3 <= h) {
            r = Math.max(w / 3, r);
        }
        System.out.println(r);
        scan.close();
    }
}
