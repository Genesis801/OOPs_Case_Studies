import java.util.Scanner;

public class TransactionMain {
	
	public static void withdraw(int accNum,double balance) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the amount you want to withdraw : ");
		double amount=sc.nextDouble();
		Withdrawal wthd=new Withdrawal(accNum,amount);
		
		wthd.execute(balance);
		
		sc.close();
	}
	
	public static void deposit(int accNum,double balance) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the amount you want to deposit : ");
		double amount=sc.nextDouble();
		Deposit deposit=new Deposit(accNum,amount);
		
		deposit.execute(balance);
		
		sc.close();
	}
	
	public static void checkBalance(int accNum,double balance) {
		Scanner sc=new Scanner(System.in);
		BalanceInquiry be=new BalanceInquiry(accNum);
		
		be.execute(balance);
		
		sc.close();
	}

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Account Number : ");
		int accNum=sc.nextInt();
		System.out.print("Enter the initial amount : ");
		double balance=sc.nextDouble();
		char ch=' ';
		int choice;
		
			System.out.println("1. Check Balance\n2. Withdraw Money\n3. Deposit Money\nEnter your choice : ");
			choice=sc.nextInt();
			switch(choice) {
			case 1: checkBalance(accNum,balance);
					break;
			case 2: withdraw(accNum,balance);
					break;
			case 3: deposit(accNum,balance);
					break;
			default: System.out.println("Enter correct choice (1-3)...");
		}
		
		
		
		
		sc.close();
		
		
	}

}
