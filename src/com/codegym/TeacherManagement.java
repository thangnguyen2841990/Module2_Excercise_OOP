package com.codegym;

public class TeacherManagement {
    private Salary[] teachers = new Salary[0];

    public TeacherManagement() {
    }

    public TeacherManagement(Salary[] teachers) {
        this.teachers = teachers;
    }

    public Salary[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Salary[] teachers) {
        this.teachers = teachers;
    }

    public void displayAllteacher() {
        for (int i = 0; i < teachers.length; i++) {
            System.out.println((i + 1) + ". " + teachers[i]);
        }
    }

    public void addNewTeacher(int index, Salary newTeacher) {
        Salary[] newTeachers = new Salary[teachers.length + 1];
        for (int i = 0; i < newTeachers.length; i++) {
            if (i < index) {
                newTeachers[i] = teachers[i];
            } else if (i == index) {
                newTeachers[i] = newTeacher;
            } else {
                newTeachers[i] = teachers[i - 1];
            }
        }
        this.teachers = newTeachers;
    }

    public void teacherSalary8m() {
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i].getTotalSalary() >= 8000000) {
                System.out.println(teachers[i]);
            }
        }
    }
}
