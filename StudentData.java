package com.company;

public class StudentData {

    static String nameOfStudent;
    static String gradeAssignment;
    static String gradeExams;


    public StudentData() {

    }

    public StudentData(String nameOfStudent) {

        this.nameOfStudent = nameOfStudent;

    }

    public StudentData(String nameOfStudent, String assignGrade) {
        this.nameOfStudent = nameOfStudent;
        this.gradeAssignment = assignGrade;
    }

    public StudentData(String nameOfStudent, String gradeAssignment, String gradeExam) {
        this.nameOfStudent = nameOfStudent;
        this.gradeAssignment = gradeAssignment;
        this.gradeExams = gradeExam;

    }


    void setNameOfStudent(String name) {
        this.nameOfStudent=name;
    }

    void setGradeAssignment(String grade) {
         this.gradeAssignment=grade;
    }

    void setGradeExams(String gradeExam) {
         this.gradeExams = gradeExam;
    }

    String getNameOfStudent() {
        return this.nameOfStudent;
    }

    String getGradeAssignment() {
        return this.gradeAssignment;
    }

    String getGradeExams() {
        return this.gradeExams;
    }



}
