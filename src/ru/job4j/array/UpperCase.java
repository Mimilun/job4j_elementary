package ru.job4j.array;

public class UpperCase {

    public static char[] toUpperCase(char[] string) {
        char[] upChar = new char[string.length];
        int index = 0;
        for (int str : string) {
            upChar[index++] = (char) Character.toUpperCase(str);
        }
        return upChar;
    }
}
