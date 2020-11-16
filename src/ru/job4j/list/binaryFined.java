package ru.job4j.list;

import java.util.*;

public class binaryFined {
    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arrList.add(new Random().nextInt(50));
        }
        //printList(arrList);
        Set<Integer> arrSet = new HashSet<>(arrList);
        arrList.clear();
        arrList.addAll(arrSet);
        Collections.sort(arrList);
        printList(arrList);
        int rsl = find(arrList, 17);
        System.out.println(rsl);
    }

    public static void printList(List<? extends Integer> in) {
        for (int i = 0; i < in.size(); i++) {
            System.out.printf("%-4d", in.get(i));
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static int find(List list, int serch) {
        int hi = list.size() - 1;
        int low = 0;
        int cur;

        while (true) {
            cur = (hi + low) / 2;
            if ((int) list.get(cur) == serch) {
                return cur;
            }
            if (hi < low) {
                return 999;
            }
            if (serch < (int) list.get(cur)) {
                hi = cur - 1;
            } else {
                low = cur + 1;
            }
        }
    }
}
