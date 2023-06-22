package 기하학;

import java.util.Scanner;

public class q1019 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nums[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int n = scan.nextInt();
        for (int i = 1; i < n + 1; i++) {
            int k = i;
            while (k > 0) {
                nums[k % 10] += 1;
                k /= 10;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(nums[i] + " ");
        }
        scan.close();
    }
}
