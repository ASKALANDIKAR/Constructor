
//Define an Employee class with attributes: empId, empName, designation, salary.
//   Implement a method to display employee details.
//   Implement a method to calculate bonus (Cut 10% of salary if salary > 50,000, otherwise 5%).
//   Create a Main class to test the logic.

package com.Practice;

public class Employee {
    int empId;
    String empName;
     String designation;
    double salary;


    public Employee(int empId, String empName, String designation, double salary)
    {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\n\nEmployee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void bonus()
    {
        double bonus;
        if (salary > 50000) {
            bonus = salary * 0.10; // 10% cut
        } else {
            bonus = salary * 0.05; // 5% cut
        }
        System.out.println("Bonus Amount: " + bonus);
    }

}



















