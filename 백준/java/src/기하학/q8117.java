package 기하학;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class q8117 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        while (true) {
            int n = scan.nextInt();
            if (n == 0) {
                break;
            }
            nums.add(n);
        }
        int l = nums.size();
        boolean r = true;
        for (int i = 0; i < l; i++) {
            if (r == true) {
                for (int j = i + 1; j < l; j++) {
                    if (r == true) {
                        for (int k = j + 1; k < l; k++) {
                            int[] tri = { nums.get(i), nums.get(j), nums.get(k) };
                            Arrays.sort(tri);
                            if (tri[0] + tri[1] > tri[2]) {
                                System.out.println(String.format("%d %d %d", nums.get(i), nums.get(j), nums.get(k)));
                                r = false;
                                break;
                            }
                        }
                    } else {
                        break;
                    }
                }
            } else {
                break;
            }
        }
        if (r == true) {
            System.out.println("NIE");
        }
        scan.close();
    }
}
