package hospital;

import java.util.Scanner;

public class HospitalApp {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Doctor Phil = new Doctor("111", "Phil", "Brain");
		Surgeon Harry = new Surgeon("222", "Harry", "Plastic", true);
		Nurse Jackie = new Nurse("333", "Jackie");
		Janitor Rosie = new Janitor("555", "Rosie");
		Receptionist Janine = new Receptionist("444", "Janine");
		
		Hospital hospital = new Hospital();
		hospital.addEmployee(Phil);
		hospital.addEmployee(Harry);
		hospital.addEmployee(Rosie);
		hospital.addEmployee(Jackie);
		hospital.addEmployee(Janine);
		
		System.out.println("Welcome to High St Hospital!");
		
		System.out.println("Here are the pay rates: ");
		hospital.showPayRates();
		
		System.out.println("Here are the employees with medical abilities: ");
		hospital.showAllMedicalPersonnel();
		
		String nameChosen;
		System.out.println("type the name of an employee to access employee info:");
		nameChosen = input.nextLine();
	}

}
