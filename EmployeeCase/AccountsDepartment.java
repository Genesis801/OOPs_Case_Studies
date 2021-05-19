package classesandobjects;

public class AccountsDepartment extends HrDepartment{
	private int salaryDays;
	private int salary;
	public void calculateSalary()
	{
		salaryDays= (30 - showLeaveDays());
		salary=salaryDays*salaryPerDay();
	}
	
	public void displaySalary() {
		System.out.println("Salary of the employee for the month:");
		System.out.println("======================================");
		System.out.println("Salary :"+ salary);
	}
}
