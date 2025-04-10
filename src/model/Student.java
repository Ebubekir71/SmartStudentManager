package model;

import java.util.List;

public class Student {
    private String studentNumber;
    private List<Integer> grades;

    public Student(String studentNumber, List<Integer> grades) {
        this.studentNumber = studentNumber;
        this.grades = grades;
    }
    public String getStudentNumber() {
        return studentNumber;
    }
    public List<Integer> getGrades() {
        return grades;
    }
    public void addGrade(int grade) {
        grades.add(grade);
    }
    public double getAverage() {
        int sum = 0;
        int count= 0;
        for (Integer grade : grades) {
            sum += grade;
            count++;

        }
        return (double) sum/count;
    }
}
