package com.SSU;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher mel = new Teacher(2, "Mel", 700);
        Teacher bob = new Teacher(3, "Bob", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mel);
        teacherList.add(bob);

        Student tim = new Student(1,"Tim", 7);
        Student ryan = new Student(2, "Ryan", 9);
        Student bill = new Student(3,"Bill", 11);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tim);
        studentList.add(ryan);
        studentList.add(bill);

        School highSchool = new School(teacherList, studentList);

        tim.payFees(9000);
        ryan.payFees(6000);
        System.out.println("Highschool has earned £" + highSchool.getTotalMoneyEarned());

        System.out.println("----------Making school pay Salary---------");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("Highschool has paid " + lizzy.getName() + "her salary and now the school has £" +highSchool.getTotalMoneyEarned());

        bob.receiveSalary(bob.getSalary());
        System.out.println("Highschool has paid " + bob.getName() + "her salary and now the school has £" +highSchool.getTotalMoneyEarned());

        System.out.println(tim);
        System.out.println(bob);

        Teacher megan = new Teacher(7, "Megan", 1200);
        highSchool.addTeacher(megan);

        System.out.println(megan);
    }
}
