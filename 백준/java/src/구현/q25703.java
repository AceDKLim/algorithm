package 구현;

import java.util.Scanner;

public class q25703 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        System.out.println("int a;");
        System.out.println("int *ptr = &a;");
        if (n > 1) {
            System.out.println("int **ptr2 = &ptr;");
        }
        for (int i = 3; i <= n; i++) {
            System.out.print("int ");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.printf("ptr%d = &ptr%d;\n", i, i - 1);
        }
    }
}
