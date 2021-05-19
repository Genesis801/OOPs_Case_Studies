public class Transaction {
	
	private int accountNumber;

	/**
	 * 
	 */
	public Transaction() {
		super();
	}

	/**
	 * @param accountNumber
	 */
	public Transaction(int accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}

	/**
	 * @return the accountNumber
	 */
	public int getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void execute() {
		System.out.println("Account Number : "+accountNumber);
	}
}
