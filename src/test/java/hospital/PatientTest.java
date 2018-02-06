package hospital;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class PatientTest {
	@Test
	public void shouldBeAbleToRemoveBlood() {
		Patient patient = new Patient();
		patient.removeBlood(3);
		int currentBloods = patient.getBloods();
		assertThat(Patient.DEFAULT_BLOODS - 3, is(currentBloods));
	}

	@Test
	public void shouldBeAbleToAddHealth() {
		Patient patient = new Patient();
		patient.giveHealth(10);
		int currentHealth = patient.getHealth();
		assertThat(Patient.DEFAULT_HEALTH + 10, is(currentHealth));
	}
}
