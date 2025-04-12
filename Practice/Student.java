

// Define a Student class with attributes: studentId, studentName, course, year, percentage.
//   Implement a method to display student details.
//   Implement a method to calculate the student's grade based on the percentage.
//   Create a Main class to test the functionality.


package com.Practice;
public class Student {
    int StudID;
    String studName;
    String course;
    int year;
    float percentage;

     public Student(int StudID, String studName, String course, int year, float percentage){
         this.StudID = StudID;
         this.studName=studName;
         this.course=course;
         this.year=year;
         this.percentage=percentage;

    }
    public void studentDetail(){
        System.out.println("\n"+"STUDENT DETAILS ");
        System.out.println("ID: "+ this.StudID );
        System.out.println("Name: "+ this.studName );
        System.out.println("Course: "+ this.course );
        System.out.println("Year: "+ this.year );
        System.out.println("Percentage: "+ this.percentage+ "\n");
    }

    public void calculate(){
         if(percentage >= 80.00  ){
             System.out.println("PASS with DISTINCTION \n Grade A" );
         }
         else if (percentage >=60.00) {
             System.out.println("PASS \n Grade B");
         }
         else if (percentage>=35.00){
             System.out.println("JUST PASS \n Grade C");
         }
         else{
             System.out.println("FAILED ! \n Better Luck Next Time :) ");
         }

    }
// call in same Class (main method)
    public static void main(String[] args) {
         Student s =new Student(101,"Jay ","JAVA ", 2025, 85.99F);
         s.studentDetail();
        s.calculate();
    }
}
