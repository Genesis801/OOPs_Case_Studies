package classesandobjects;

public class InsuranceDepartment extends Employee {
	
	public float insuranceEligibility=50000;
	public float insuranceAmtClaimed;
	
	public void readInsuranceDetails() {
		System.out.println("Enter Insurance Amount Claimed :");
		insuranceAmtClaimed=sc.nextFloat();
	}
	
	public void checkInsuranceEligibility() {
		if(insuranceAmtClaimed>insuranceEligibility) {
			System.out.println("Amount Claimed Exceeded");
		}else {
			System.out.println("Amount Claimed = "+(insuranceEligibility-insuranceAmtClaimed));
		}
	}
}
