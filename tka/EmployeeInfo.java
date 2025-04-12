//Call Employee Class here by Creating Objects in EmployeeInfo Class

package com.tka;
public class EmployeeInfo {

    public static void main(String[] args) {
        Employee e = new Employee(5013,"Anuja", "7yr");
        System.out.println("Emploee ID: "+e.empID);
        System.out.println("Emploee Name: "+e.empName);
        System.out.println("Emploee Experience: "+e.experience);
    }

}

