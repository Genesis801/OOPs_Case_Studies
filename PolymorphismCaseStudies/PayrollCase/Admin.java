package classesandobjects;

public class Admin extends Payroll{
	String name;
	int salary;
	
	Admin(String name,int salary){
		this.name=name;
		this.salary=salary;
		super.adjustSalary(salary);
	}
	
	public void doAdminStuff() {
		System.out.println("Doing admin stuff");
	}
}
