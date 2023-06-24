package 기하학;

import java.util.Scanner;

public class q13655 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int d = scan.nextInt();
            int vf = scan.nextInt();
            int vg = scan.nextInt();
            double thief = 12.0 / vf;
            double police = Math.sqrt(144 + d * d) / vg;
            if (thief < police) {
                System.out.println("N");
            } else {
                System.out.println("S");
            }
        }
        scan.close();
    }
}
