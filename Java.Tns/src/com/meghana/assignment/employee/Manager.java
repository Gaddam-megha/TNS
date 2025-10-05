package com.meghana.assignment.employee;

/**
 * Manager adds teamSize and overrides bonus rules.
 */
public class Manager extends Employee {

    private int teamSize;

    public Manager(String name, int id, double monthlySalary, String department, int teamSize) {
        super(name, id, monthlySalary, department);
        this.teamSize = teamSize;
    }

    public int getTeamSize() { return teamSize; }
    public void setTeamSize(int teamSize) { this.teamSize = teamSize; }

    @Override
    protected double computeAnnualBonus() {
        // Managers: 12% + 0.5% per team member of the annual base
        double annualBase = getMonthlySalary() * 12;
        double extra = 0.005 * Math.max(0, teamSize);
        return annualBase * (0.12 + extra);
    }
}
