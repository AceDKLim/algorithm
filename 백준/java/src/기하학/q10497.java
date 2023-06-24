package 기하학;

import java.util.ArrayList;
import java.util.Scanner;

public class q10497 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> target = new ArrayList<>();
        // ArrayList<Integer> square = new ArrayList<Integer>();
        int m = scan.nextInt();
        for (int i = 0; i < m; i++) {
            ArrayList<Integer> coords = new ArrayList<Integer>();
            String name = scan.next();
            int s = name == "rectangle" ? 4 : 3;
            for (int j = 0; j < s; j++) {
                coords.add(scan.nextInt());
            }
            target.add(coords);
        }
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            int x = scan.nextInt();
            int y = scan.nextInt();
            for (int j = 0; j < m; j++) {
                if (target.get(j).size() == 3) {
                    int tx = target.get(j).get(0);
                    int ty = target.get(j).get(1);
                    int tr = (int) Math.pow(target.get(j).get(2), 2);

                    int rx = (int) Math.pow(tx - x, 2);
                    int ry = (int) Math.pow(ty - y, 2);
                    if (rx + ry <= tr) {
                        cnt++;
                    }
                } else {
                    int tx1 = target.get(j).get(0);
                    int ty1 = target.get(j).get(1);
                    int tx2 = target.get(j).get(2);
                    int ty2 = target.get(j).get(3);
                    if (tx1 <= x && x <= tx2 && ty1 <= y && y <= ty2) {
                        cnt++;
                    }
                }
                System.out.println(cnt);
            }
        }
        scan.close();
    }
}
