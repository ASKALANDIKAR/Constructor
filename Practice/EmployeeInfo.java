
// Calling Employee.class here

package com.Practice;

public class EmployeeInfo {

    public static void main(String[] args) {
        Employee emp1= new Employee(101,"ANUJ", "JAVA Developer", 60000);

        System.out.println(emp1);
        emp1.bonus();

    }
}
