package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class Administrator {

     ArrayList<StudentData> student = new ArrayList<>();



    public void enrollStudent() {
        Scanner myObj = new Scanner(System.in);


        String name = myObj.nextLine();
        String gradeAssignment = myObj.nextLine();
        String gradeExams = myObj.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Assignment Grade: " + gradeAssignment);
        System.out.println("Exam Grade: " + gradeExams);




        // for (int i = 0; i < student.size(); i++) {


        StudentData studentX = new StudentData(name, gradeAssignment, gradeExams);


        studentX.setNameOfStudent(name);
        studentX.setGradeAssignment(gradeAssignment);
        studentX.setGradeExams(gradeExams);

        student.add(studentX);


        // }


    }

    public void addAnotherStudentMessage() {
        Scanner myObj = new Scanner(System.in);

        System.out.print('\n' + "Press 2 if you want to add another student" + "\n" + "Press 3 to list all students"+"\n" );
        if(myObj.nextInt()==2){
            displayWelcomeMessage();
            enrollStudent();
            addAnotherStudentMessage();

        }

    }

    public void listAllStudent() {
        Scanner myObj = new Scanner(System.in);
        if(myObj.nextInt()==3) {

            for (int i =0; i<student.size();i++){
                System.out.print(student.get(i));
            }

            //for(StudentData student: student){
             //  System.out.print(student.getNameOfStudent()+student.getGradeAssignment()+student.getGradeExams());
            //}

            //for(int i=0;i<student.size();i++){
             //   System.out.print(student +"\n"+StudentData.gradeAssignment+"\n"+StudentData.gradeExams);

           // }

        }
    }

    public void displayWelcomeMessage() {

        System.out.println("Enter Student's Name" + '\n' + "Assignment Grade" + '\n' + "And Exam Grade" + '\n');

    }

    public void unenrollStudent(){

    }


}
