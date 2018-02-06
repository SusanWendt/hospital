package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DoctorTest {
	Doctor underTest = new Doctor("111", "Phil");
	Patient patient = new Patient();
	
	// this test uses state verification

	@Test
	public void shouldDrawBlood() {
		int bloodsBefore = patient.getBloods();
		underTest.drawBlood(patient);
		int bloodsAfter = patient.getBloods();
		assertThat(bloodsBefore - bloodsAfter, is(1));
	}

	boolean wasBled = false;

	public class BleedableDouble implements Bleedable {
		@Override
		public void removeBlood(int amount) {
			wasBled = true;
		}
	}

	// this test uses behavior verification.

	@Test
	public void shouldDrawBloodFromTestDouble() {
		Bleedable patient = new BleedableDouble(); // constructor
		underTest.drawBlood(patient);
		assertThat(wasBled, is(true));
	}

	@Test
	public void shouldHaveSalary() {
		Employee underTest = new Doctor("","");
		int salary = underTest.getSalary();
		assertThat(salary, is(90000));
	}
	
	@Test
	public void shouldIncreasePatientHealth() {
		int healthBefore = patient.getHealth();
		underTest.administerCare(patient);
		int healthAfter = patient.getHealth();
		assertThat(healthAfter-healthBefore, is(10));
	}
	
	@Test
	public void shouldReturnEmployeeNum() {
		String check = underTest.getEmpNumber();
		assertEquals(check, "111");
	}
	@Test
	public void shouldReturnEmployeeName() {
		String check = underTest.getEmpName();
		assertEquals(check, "Phil");
	}
}











