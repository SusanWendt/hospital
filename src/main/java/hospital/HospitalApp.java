package hospital;

public class HospitalApp {

	public static void main(String[] args) {
		Doctor Phil = new Doctor("111", "Phil");
		Surgeon Harry = new Surgeon("222", "Harry", true);
		Janitor Rosie = new Janitor("444", "Rosie");
		Nurse Jackie = new Nurse("333", "Jackie");

		Hospital hospital = new Hospital();
		hospital.addEmployee(Phil);
		hospital.addEmployee(Harry);
		hospital.addEmployee(Rosie);
		hospital.addEmployee(Jackie);
		System.out.println("here are the pay rates: ");
		hospital.showPayRates();
	}

}
