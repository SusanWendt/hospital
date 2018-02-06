package hospital;

public class Surgeon extends Doctor {

	private boolean isOperating;

	public Surgeon(String empNumber, String empName, boolean isOperating) {
		super(empNumber, empName);
		this.isOperating = isOperating; 
	}
	
	@Override
	public int getSalary() {
		return 120000;
	}
}
