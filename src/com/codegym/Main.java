package com.codegym;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
        int choice = -1;
        TeacherManagement teacherManagement = new TeacherManagement();
        menu();
        do {
            System.out.println("Enter Menu: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    teacherManagement.displayAllteacher();
                    break;
                }
                case 2: {
                    System.out.println("----Thêm giáo viên----");
                    System.out.println("Nhập ví trí muốn thêm: ");
                    int index = scanner.nextInt();
                    if (index - 1 < 0 || index - 1 > teacherManagement.getTeachers().length) {
                        System.out.println("Vị trí không xác định");
                    } else {
                        Salary newTeacher = inputTeacherInfo();
                        teacherManagement.addNewTeacher(index -1, newTeacher);
                    }
                    break;
                }
                case 3: {
                    System.out.println("---Hiển thị thông tin giáo viên lương >= 8 triệu----");
                    teacherManagement.teacherSalary8m();
                    break;
                }
            }
        } while (choice != 4);
    }

    public static void menu() {
        System.out.println("----MENU QUẢN LÝ GIÁO VIÊN----");
        System.out.println("1. Hiển thị toàn bộ danh sách giáo viên");
        System.out.println("2. Thêm giáo viên");
        System.out.println("3. Hiển thị giáo viên lương > 8 triệu");
        System.out.println("4. Thoát");
    }

    public static Salary inputTeacherInfo() {
        scanner.nextLine();
        System.out.println("Họ và tên: ");
        String name = scanner.nextLine();
        System.out.println("Sinh nhật: ");
        String birthDay = scanner.nextLine();
        System.out.println("Quê quán: ");
        String hometown = scanner.nextLine();
        System.out.println("Nhập lương cơ bản: ");
        double basicSalary = scanner.nextDouble();
        System.out.println("Thưởng: ");
        double bonus = scanner.nextDouble();
        System.out.println("Phạt: ");
        double fine = scanner.nextDouble();
        return new Salary(basicSalary, bonus, fine, new Teacher(name, birthDay, hometown));
    }
}
