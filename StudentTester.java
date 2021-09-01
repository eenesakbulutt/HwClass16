package com.collection.class17;

public class StudentTester {
    public static void main(String[] args) {
      //  /*
        //    Create a Class called Students
        //    Create three  variables  studentName , studentID  and  numberOfStudents
        //    Create three objects of the Students Class
        //    Set the value for  studentName , studentID and increment  the numberOfStudents
        //    for each object
        //    Print out  total number of students
        //     */

        Student student=new Student();
        student.studentId="1";
        student.studentName="Michael";
        Student.numberOfStudents++;
        Student student1=new Student();
        student1.studentName="Serge";
        student1.studentId="2";
        Student.numberOfStudents++;
        Student student2=new Student();
        student2.studentId="3";
        student2.studentName="Mars";
        Student.numberOfStudents++;
        System.out.println(Student.numberOfStudents);
    }
}
