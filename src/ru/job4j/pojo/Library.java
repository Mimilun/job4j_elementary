package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book bookOne = new Book();
        Book bookTwo = new Book();
        Book bookThree = new Book();
        Book bookFour = new Book();

        Book[] libr = new Book[4];
        libr[0] = bookOne;
        libr[1] = bookTwo;
        libr[2] = bookThree;
        libr[3] = bookFour;

        libr[0].setName("Clean code");

        for (int i = 0; i < libr.length; i++) {
            System.out.println(libr[i].getName());
        }
        System.out.println();

        Book[] temp = new Book[1];
        temp[0] = libr[0];
        libr[0] = libr[3];
        libr[3] = temp[0];

        for (int i = 0; i < libr.length; i++) {
            System.out.println(libr[i].getName());
        }
        System.out.println();

        for (int i = 0; i < libr.length; i++) {
            if (libr[i].getName() != null && libr[i].getName().equals("Clean code")) {
                System.out.println(libr[i].getName());
            }
        }
    }
}
