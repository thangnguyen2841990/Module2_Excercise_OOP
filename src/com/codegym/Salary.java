package com.codegym;

public class Salary {
    private double basicSalary;
    private double bonus;
    private double fine;
    private Teacher teacher;

    public Salary(double basicSalary, double bonus, double fine, Teacher teacher) {
        this.basicSalary = basicSalary;
        this.bonus = bonus;
        this.fine = fine;
        this.teacher = teacher;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }
    public double getTotalSalary(){
        return this.basicSalary + this.bonus -this.fine;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return teacher.toString()+ ", Lương cơ bản: " + this.basicSalary + ", thưởng: "+this.bonus + ", phạt: "+ this.fine+
                "\n Lương thực lĩnh: " + getTotalSalary();
    }
}
