package ru.job4j.ru.job4j.pojo;

import ru.job4j.pojo.Student;

public class College {

    public static void main(String[] args) {
        Student stud = new Student();

        stud.setFio("Пупкин Сергей Тимурович");
        stud.setGroup(123);
        stud.setAdmission("2.08.1999");

        System.out.println("Ф.И.О студента: " + stud.getFio());
        System.out.println("№ группы: " + stud.getGroup());
        System.out.println("Дата поступления: " + stud.getAdmission());
    }
}
