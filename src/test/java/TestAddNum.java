import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddNum {

	@Test
	public void testCodeAdd() {
		AdditionApp app = new AdditionApp();
		String output= app.Fullname("JUnit");
		assertEquals("JUnit",output);
	}

}
