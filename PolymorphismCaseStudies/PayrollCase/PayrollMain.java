import java.util.Scanner;

public class PayrollMain {
	
	public void academicStaff() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name of Faculty:");
		String name=sc.next();
		System.out.println("Enter salary of faculty:");
		int salary=sc.nextInt();
		
		Academic ac=new Academic(name,salary);
		ac.adjustSalary(salary);
		ac.giveLecture();
		sc.close();
	}
	
	public void adminStaff() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name of Admin:");
		String name=sc.next();
		System.out.println("Enter salary of Admin:");
		int salary=sc.nextInt();
		
		Admin ad=new Admin(name,salary);
		ad.adjustSalary(salary);
		ad.doAdminStuff();
		
		sc.close();
	}
	
	public void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1.For Admin Staff\n2.For Academic Staff");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			adminStaff();
			break;
		case 2:
			academicStaff();
			break;
		default:System.out.println("Wrong choice !!");
				
		}
		sc.close();
	}
}
