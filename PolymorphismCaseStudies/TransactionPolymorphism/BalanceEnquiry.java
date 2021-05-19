public class BalanceEnquiry extends Transaction {
	
	public BalanceEnquiry(){
		super();
	}
	public BalanceEnquiry(int accountNumber){
		super(accountNumber);
	}
	public void execute(double balance) {
		super.execute();
		System.out.println("Balance : "+balance);
	}

}
