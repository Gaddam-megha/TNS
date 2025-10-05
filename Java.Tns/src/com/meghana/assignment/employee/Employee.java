package com.meghana.assignment.employee;

/**
 * Base Employee class demonstrating encapsulation and access modifiers.
 */
public class Employee {

    // ---- Encapsulated (private) state ----
    private String name;
    private int employeeId;
    private double monthlySalary;

    // ---- Protected member (visible to subclasses & same package) ----
    protected String department;

    // ---- Constructors ----
    public Employee() {}

    public Employee(String name, int employeeId, double monthlySalary, String department) {
        this.name = name;
        this.employeeId = employeeId;
        setMonthlySalary(monthlySalary); // validation reused
        this.department = department;
    }

    // ---- Public getters/setters (controlled access) ----
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getEmployeeId() { return employeeId; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }

    public double getMonthlySalary() { return monthlySalary; }
    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary < 0) throw new IllegalArgumentException("Salary cannot be negative");
        this.monthlySalary = monthlySalary;
    }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    // ---- Behavior ----
    /** Hook method for subclasses: default bonus = 8% of annual base. */
    protected double computeAnnualBonus() {
        return (monthlySalary * 12) * 0.08;
    }

    /** Public API that uses the protected hook above. */
    public double getAnnualCompensation() {
        return monthlySalary * 12 + computeAnnualBonus();
    }

    @Override
    public String toString() {
        return "Employee{name='%s', id=%d, dept='%s', monthlySalary=%.2f}"
                .formatted(name, employeeId, department, monthlySalary);
    }
}
