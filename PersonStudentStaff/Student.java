public class Student extends Person{
	private String program;
	private int year;
	private double fees;
	
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Person: [" +this.name + "] Address: [" +this.address+ "], program: ["+
	this.program+ "], Year: [" +this.year+ "], fees: [" +this.fees+"]";
	}
	
}
