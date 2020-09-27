package ru.job4j.oop;

public class Jukebox {

    public void music(int position) {
        String sound1 = "Пусть бегут неуклюже";
        String sound2 = "Спокойной ночи";
        if (position == 1) {
            System.out.println(sound1);
        } else if (position == 2) {
            System.out.println(sound2);
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox melody = new Jukebox();
        melody.music(1);
        melody.music(2);
        melody.music(18);
    }
}
