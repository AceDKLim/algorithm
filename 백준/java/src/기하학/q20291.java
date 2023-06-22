package 기하학;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class q20291 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Comparator<String> comparator = (s1, s2) -> s1.compareTo(s2);
        Map<String, Integer> word = new TreeMap<>(comparator);
        for (int i = 0; i < n; i++) {
            String file = scan.nextLine().split(".")[1];
            System.out.println(file);
            if (word.containsKey(file)) {
                word.put(file, word.get(file) + 1);
            } else {
                word.put(file, 1);
            }
        }
        for (String string : word.keySet()) {
            System.out.println(string + " " + word.get(string));
        }
        scan.close();
    }
}
