package com.meghana.assignment.employee;

/**
 * Developer adds primaryLanguage and overrides bonus rules.
 */
public class Developer extends Employee {

    private String primaryLanguage;

    public Developer(String name, int id, double monthlySalary, String department, String primaryLanguage) {
        super(name, id, monthlySalary, department);
        this.primaryLanguage = primaryLanguage;
    }

    public String getPrimaryLanguage() { return primaryLanguage; }
    public void setPrimaryLanguage(String primaryLanguage) { this.primaryLanguage = primaryLanguage; }

    @Override
    protected double computeAnnualBonus() {
        // Developers: 10% default; 12% for Java/Python/Go
        double annualBase = getMonthlySalary() * 12;
        boolean hot =
            primaryLanguage != null &&
            (primaryLanguage.equalsIgnoreCase("Java")
          || primaryLanguage.equalsIgnoreCase("Python")
          || primaryLanguage.equalsIgnoreCase("Go"));
        return annualBase * (hot ? 0.12 : 0.10);
    }
}
