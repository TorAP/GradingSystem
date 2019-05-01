package com.company;

import java.util.ArrayList;
import java.util.Scanner;

import static com.company.Administrator.*;

public class Main {

    public static void main(String[] args) {

        Administrator adm = new Administrator();


        adm.displayWelcomeMessage();
        adm.enrollStudent();
        adm.addAnotherStudentMessage();
        adm.listAllStudent();

        /*

        Scanner myObj = new Scanner(System.in);



            ArrayList<StudentData> student = new ArrayList<>();

        for (int i = 0; i < student.size(); i++) {


            StudentData studentX = new StudentData();
            studentX.setGradeAssignment();
            studentX.setNameOfStudent();
            studentX.setGradeExams();
            student.add(studentX);

*

        }

        if (myObj.hasNext("Watch")){


        }

        // String input
        String name = myObj.nextLine();
        String gradeAssignment = myObj.nextLine();
        String gradeExams = myObj.nextLine();


        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Assignment Grade: " + gradeAssignment);
        System.out.println("Exam Grade: " + gradeExams);

*/

    }

}




