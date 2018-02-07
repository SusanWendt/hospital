package hospital;

public class Receptionist extends Employee {
	public Receptionist(String empNumber, String empName) {
		this.empNumber = empNumber;
		this.empName = empName;
	}
	@Override
	public int getSalary() {
		return 45000;
	}
}