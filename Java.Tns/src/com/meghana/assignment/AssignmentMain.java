package com.meghana.assignment;
import com.meghana.assignment.employee.Developer;
import com.meghana.assignment.employee.Manager;
import com.meghana.assignment.utilities.EmployeeUtilities;


public class AssignmentMain {
	public static void main(String[] args) {
        Manager m = new Manager("Aparna", 101, 120000.0, "Operations", 8);
        Developer d = new Developer("Ravi", 202, 95000.0, "Engineering", "Java");

        System.out.println(EmployeeUtilities.summary(m));
        System.out.println(EmployeeUtilities.summary(d));

        EmployeeUtilities.giveRaise(m, 7.5);
        EmployeeUtilities.transferDepartment(d, "Platform");

        System.out.println("\n-- After updates --");
        System.out.println(EmployeeUtilities.summary(m));
        System.out.println(EmployeeUtilities.summary(d));
    }
}
	


