import java.util.Scanner;
import java.util.Date;
import java.text.*;
public class Employee {
	private int empId;
	private String empName;
	private String empDob;
	private String empDoj;
	
	Scanner sc=new Scanner(System.in);
	
	Date dob=new Date();
	Date doj=new Date();
	
	//for converting date to specified format
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	
	public void addEmployee() throws ParseException{
		System.out.println("Enter employee Details:");
		System.out.println("===========================");
		
		System.out.println("Enter Employee Id");
		empId=sc.nextInt();
		
		System.out.println("Enter Employee Name");
		sc.nextLine();
		empName=sc.nextLine();
		
		System.out.println("Enter Employee DoB in [dd/MM/yyyy] format");
		empDob=sc.next();
		dob=convertStringToDate(empDob);
		
		System.out.println("Enter Employee Doj in [dd/MM/yyyy] format");
		empDoj=sc.next();
		doj=convertStringToDate(empDoj);
	}
	
	public void displayEmployeeDetails(){
		System.out.println("Employee Details are:");
		System.out.println("=========================");
		System.out.println("Employee Id: "+empId);
		System.out.println("=========================");
		System.out.println("Employee Name: "+empName);
		System.out.println("=========================");
		System.out.println("Employee DoB: "+empDob);
		System.out.println("=========================");
		System.out.println("Employee Id: "+empDoj);
	}
	
	public Date convertStringToDate(String date)throws ParseException
	{
		Date stringToDate=sdf.parse(date);
		return stringToDate;
	}
}
