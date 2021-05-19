package classesandobjects;

public class HrDepartment extends Employee{
	
	private int noOfWorkingDays=30;
	private int noOfLeaveDays;
	private int salaryPerDay;
	public void readLeaveDays()
	{
		System.out.println("Enter number of leave days: ");
		System.out.println("==========================");
		noOfLeaveDays=sc.nextInt();
	}
	
	public int salaryPerDay() {
		System.out.println("Enter the salary per day:");
		salaryPerDay= sc.nextInt();
		return salaryPerDay;
	}
	
	public int showLeaveDays() {
		System.out.println("Number of leave days: "+noOfLeaveDays);
		return noOfLeaveDays;
	}
	public int showWorkingDays() {
		return noOfWorkingDays;
	}

}
