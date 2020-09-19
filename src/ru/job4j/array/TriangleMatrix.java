package ru.job4j.array;

public class TriangleMatrix {

    public static int[][] rows(int count) {
        int[][] triangle = new int[count][];
        // your code here
        int inserInRow = 1;
        for (int i = 0; i < triangle.length; i++) {
            int[] row = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                row[j] = inserInRow++;
            }
            triangle[i] = row;
        }
        return triangle;
    }
}
