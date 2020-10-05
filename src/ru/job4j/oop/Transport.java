package ru.job4j.oop;

public class Transport {
    public static void main(String[] args) {
        Vehicle aircraft = new Aircraft();
        Vehicle train = new Train();
        Vehicle bus = new Bus();
        Vehicle[] transpotr = new Vehicle[] {aircraft, train, bus};
        for (Vehicle tp : transpotr) {
            tp.move();
        }
    }
}
