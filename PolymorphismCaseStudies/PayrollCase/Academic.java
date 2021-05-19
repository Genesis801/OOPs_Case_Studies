package classesandobjects;

public class Academic extends Payroll{
	String name;
	int salary;
	
	Academic(String name,int salary){
		this.name=name;
		this.salary=salary;
		super.adjustSalary(salary);
	}
	
	public void giveLecture() {
		System.out.println("Giving lectures");
	}
}
