package 구현;

import java.util.Scanner;

public class q25932 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int[] mem = new int[10];
            int z = 0;
            int m = 0;
            for (int j = 0; j < 10; j++) {
                mem[j] = scan.nextInt();
                if (mem[j] == 18) {
                    m = 1;
                } else if (mem[j] == 17) {
                    z = 1;
                }
            }
            String r = m == 1 && z == 1 ? "both" : m == 0 && z == 1 ? "zack" : m == 1 && z == 0 ? "mack" : "none";
            for (int j = 0; j < 10; j++) {
                System.out.print(mem[j] + " ");
            }
            System.out.println();
            System.out.println(r);
            System.out.println();
        }
        scan.close();
    }
}
