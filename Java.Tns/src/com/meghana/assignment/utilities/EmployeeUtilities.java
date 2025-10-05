package com.meghana.assignment.utilities;

import com.meghana.assignment.employee.Employee;

/**
 * Utilities that operate on Employee objects using only their public API.
 * Demonstrates correct use of access modifiers across packages.
 */
public class EmployeeUtilities {

    /** Give a percentage raise (e.g., 5 = +5%). */
    public static void giveRaise(Employee e, double percent) {
        if (e == null) return;
        double newMonthly = e.getMonthlySalary() * (1 + percent / 100.0);
        e.setMonthlySalary(newMonthly);
    }

    /** Transfer an employee to a new department. */
    public static void transferDepartment(Employee e, String newDept) {
        if (e != null) e.setDepartment(newDept);
    }

    /** Build a summary line including annual compensation. */
    public static String summary(Employee e) {
        return "%s | Annual Compensation: %s"
                .formatted(e.toString(), formatCurrency(e.getAnnualCompensation()));
    }

    // Package-private helper (visible only inside the utilities package)
    static String formatCurrency(double amount) {
        return "₹" + String.format("%,.2f", amount);
    }
}
