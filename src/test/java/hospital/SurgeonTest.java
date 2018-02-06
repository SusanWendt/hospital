package hospital;

import static org.hamcrest.Matchers.is;
//import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SurgeonTest {
	private static final boolean isOperating = true;
	Doctor underTest = new Surgeon("222", "Harry", isOperating);

	@Test
	public void shouldCreateSurgeon() {
		// Doctor underTest = new Surgeon("222", "Harry");
		int salary = underTest.getSalary();
		assertThat(salary, is(120000));
	}

//	@Test
//	public void shouldBeOperating() {
//		Surgeon underTest = new Surgeon("222", "Harry", isOperating);
//		// boolean isOperating = underTest.isOperating();
//		assertThat(isOperating, is(true));
//	}
}
